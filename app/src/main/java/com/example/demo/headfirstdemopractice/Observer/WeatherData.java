package com.example.demo.headfirstdemopractice.Observer;

import java.util.ArrayList;

/**
 * @author ChuYinGen
 * 2018/9/7
 * @Description
 */
public class WeatherData implements Subject {
    private ArrayList<Observer> mObservers;
    private float mTemperature;
    private float mHumidity;
    private float mPressure;

    public WeatherData() {
        mObservers = new ArrayList<>();
    }

    @Override
    public void removeObserVer(Observer observer) {
        int i = mObservers.indexOf(observer);
        if (i >= 0) {
            mObservers.remove(observer);
        }
    }

    @Override
    public void registerObserVer(Observer observer) {
        mObservers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (int i =0;i<mObservers.size();i++){
            mObservers.get(i).update(mTemperature,mHumidity,mPressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public  void setMeasurements(float temperature,float humidity,float pressure){
        this.mTemperature = temperature;
        this.mHumidity = humidity;
        this.mPressure = pressure;
        measurementsChanged();
    }
}
