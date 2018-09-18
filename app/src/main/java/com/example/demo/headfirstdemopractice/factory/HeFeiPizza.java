package com.example.demo.headfirstdemopractice.factory;

/**
 * @author ChuYinGen
 * 2018/9/18
 * @Description
 */
public class HeFeiPizza extends Pizza {
    public HeFeiPizza() {
        name = "HeFei Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        topping.add("Shredded Mozzarella Cheese");
    }

    public void cut(){
        System.out.println("Cutting the Pizza into square slices");
    }
}
