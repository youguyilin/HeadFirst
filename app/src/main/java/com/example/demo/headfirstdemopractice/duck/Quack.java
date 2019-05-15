package com.example.demo.headfirstdemopractice.duck;

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


    public static class FlyNoWay implements FlyBehavior {
        @Override
        public void fly() {
            System.out.println("I can't fly");
        }
    }
}
