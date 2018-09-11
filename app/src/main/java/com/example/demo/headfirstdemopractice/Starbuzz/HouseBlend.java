package com.example.demo.headfirstdemopractice.Starbuzz;

/**
 * @author ChuYinGen
 * 2018/9/11
 * @Description
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
