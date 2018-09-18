package com.example.demo.headfirstdemopractice.factory;

/**
 * @author ChuYinGen
 * 2018/9/18
 * @Description
 */
public class HeFeiPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        return new HeFeiPizza();
    }
}
