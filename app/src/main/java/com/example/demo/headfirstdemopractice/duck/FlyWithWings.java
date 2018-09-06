package com.example.demo.headfirstdemopractice.duck;

import com.example.demo.headfirstdemopractice.duck.FlyBehavior;

/**
 * @author ChuYinGen
 * 2018/9/6
 * @Description
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with wings!!!");
    }
}
