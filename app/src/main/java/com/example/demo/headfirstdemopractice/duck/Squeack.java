package com.example.demo.headfirstdemopractice.duck;

/**
 * @author ChuYinGen
 * 2018/9/6
 * @Description
 */
public class Squeack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("squeack");
    }
}
