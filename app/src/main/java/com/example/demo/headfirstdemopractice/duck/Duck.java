package com.example.demo.headfirstdemopractice.duck;

/**
 * @author ChuYinGen
 * 2018/9/6
 * @Description
 */
public abstract class Duck {
    FlyBehavior mFlyBehavior;
    QuackBehavior mQuackBehavior;

    public Duck() {
    }

    public abstract void display();

    /**
     * 委托给行为类
     */
    public void performFly(){
        mFlyBehavior.fly();
    }

    public void performQuack(){
        mQuackBehavior.quack();
    }

    public void swim(){
        System.out.println("All duck float,even decoys");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        mFlyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        mQuackBehavior = quackBehavior;
    }
}
