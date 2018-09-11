package com.example.demo.headfirstdemopractice.Starbuzz;

/**
 * @author ChuYinGen
 * 2018/9/11
 * @Description
 */
public abstract class Beverage {
    public String description = "default Beverage";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double cost();
}
