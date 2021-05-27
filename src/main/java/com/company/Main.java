package com.company;

public class Main {

    public static void main(String[] args) {
        PizzaBuilder pizMaker = new PizzaBuilder();
        pizMaker.SetTesto(Pizza.testoType.sausage);
        try {
            pizMaker.AddSmthToMyPiza("Sausage", 2);
            pizMaker.AddSmthToMyPiza("Cheese", 3);
            pizMaker.AddSmthToMyPiza("Mushrooms", 3);
            pizMaker.AddSmthToMyPiza("Onion", 1);
        } catch (YouHaventChosenTestoException | TooMuchWeightException e) {
            e.printStackTrace();
        }
        System.out.println("Your pizza: " + pizMaker.toString());
    }
}
