package com.example.demo.headfirstdemopractice.factory;

/**
 * @author ChuYinGen
 * 2018/9/18
 * @Description
 */
public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Pepperoni createPepperoni();
    Clames createClames();

}
