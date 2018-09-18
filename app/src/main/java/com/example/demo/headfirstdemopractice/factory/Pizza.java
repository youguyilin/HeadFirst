package com.example.demo.headfirstdemopractice.factory;

import java.util.ArrayList;

/**
 * @author ChuYinGen
 * 2018/9/18
 * @Description
 */
public abstract class Pizza {
   public String name;
   public String dough;
   public String sauce;

   ArrayList topping = new ArrayList();

   public void prepare(){
       System.out.println("Preparing" + name);
       System.out.println("Tossing dough...");
       System.out.println("Adding toppings:");
        for (int i = 0;i < topping.size();i++){
            System.out.println("  " + topping.get(i));
        }
   }

   public void bake(){
       System.out.println("Bake for 25 minutes at 350");
   }

   public void cut(){
       System.out.println("Cutting the pizza into diagonal slices");
   }

   public void box(){
       System.out.println("Place pizza in official PizzaStore box");
   }

    public String getName() {
        return name;
    }
}
