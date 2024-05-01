package com.facade;

public class Waiter {
    public static String deliverFood(FoodType foodType){

        Ingredients I = new Ingredients();

        switch (foodType) {
            case PIZZA:
                Food pizza = new Pizza();
                pizza.prepareFood(I.getPizzaItem());
                return pizza.deliverFood();

            case PASTA:
                Food pasta = new Pasta();
                pasta.prepareFood(I.getPastaItem());
                return pasta.deliverFood();
        }
        return null;
    }
}
