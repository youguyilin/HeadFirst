package com.example.demo.headfirstdemopractice.Starbuzz;

/**
 * @author ChuYinGen
 * 2018/9/11
 * @Description 浓缩咖啡
 */
public class Expresso extends Beverage {

    public Expresso() {
        description = "";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
