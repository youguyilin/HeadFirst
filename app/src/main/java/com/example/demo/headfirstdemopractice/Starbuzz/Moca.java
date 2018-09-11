package com.example.demo.headfirstdemopractice.Starbuzz;

/**
 * @author ChuYinGen
 * 2018/9/11
 * @Description
 */
public class Moca extends CondimentDecorator {
    Beverage mBeverage;

    public Moca(Beverage beverage) {
        mBeverage = beverage;
    }

    @Override
    public String getDescription() {
        return mBeverage.getDescription() + ",Mocha";
    }

    @Override
    public double cost() {
        return 0.2 + mBeverage.cost();
    }
}
