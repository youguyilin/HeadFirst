package com.example.demo.headfirstdemopractice.Observer;

/**
 * @author ChuYinGen
 * 2018/9/7
 * @Description
 */
public interface Subject {
    void removeObserVer(Observer observer);
    void registerObserVer(Observer observer);
    void notifyObservers();
}
