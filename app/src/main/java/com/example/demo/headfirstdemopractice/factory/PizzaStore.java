package com.example.demo.headfirstdemopractice.factory;

/**
 * @author ChuYinGen
 * 2018/9/18
 * @Description
 */
public abstract class PizzaStore {

    public Pizza orderPozza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    protected abstract Pizza createPizza(String type);

}
