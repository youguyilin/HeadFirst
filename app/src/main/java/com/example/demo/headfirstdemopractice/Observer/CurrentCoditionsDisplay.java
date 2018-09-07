package com.example.demo.headfirstdemopractice.Observer;

/**
 * @author ChuYinGen
 * 2018/9/7
 * @Description
 */
public class CurrentCoditionsDisplay implements Observer,DisplayElements {
    private static final String TAG = CurrentCoditionsDisplay.class.getSimpleName();
    private float mTempreature;
    private float mHumidity;
    private float mPressure;
    private Subject mWeatherData;

    public CurrentCoditionsDisplay(Subject weatherData) {
        mWeatherData = weatherData;
        mWeatherData.registerObserVer(this);
    }



    @Override
    public void display() {
        System.out.println(TAG + "温度：" +mTempreature + "压力：" +mPressure +"湿度：" +mHumidity);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
         this.mTempreature = temperature;
         this.mHumidity = humidity;
         this.mPressure = pressure;
    }


}
