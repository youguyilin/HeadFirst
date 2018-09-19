package com.example.demo.headfirstdemopractice.singleton;

/**
 * @author ChuYinGen
 * 2018/9/19
 * @Description
 */
public class Singleton {
    private volatile  Singleton mSingleton;

    private Singleton() {
    }

    public Singleton getSingleton() {
        if (mSingleton != null){
            synchronized (Singleton.class){
                if (mSingleton == null){
                    mSingleton = new Singleton();
                }
            }
        }
        return mSingleton;
    }
}
