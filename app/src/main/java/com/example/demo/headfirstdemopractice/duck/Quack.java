package com.example.demo.headfirstdemopractice.duck;

import com.example.demo.headfirstdemopractice.duck.FlyBehavior;
import com.example.demo.headfirstdemopractice.duck.QuackBehavior;

/**
 * @author ChuYinGen
 * 2018/9/6
 * @Description
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    /**
     * @author ChuYinGen
     * 2018/9/6
     * @Description
     */
    public static class FlyNoWay implements FlyBehavior {
        @Override
        public void fly() {
            System.out.println("I can't fly");
        }
    }
}
