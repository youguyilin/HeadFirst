package com.example.demo.headfirstdemopractice.duck;

/**
 * @author ChuYinGen
 * 2018/9/6
 * @Description
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        mQuackBehavior = new Quack();
        mFlyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a MallardDuck");
    }
}
