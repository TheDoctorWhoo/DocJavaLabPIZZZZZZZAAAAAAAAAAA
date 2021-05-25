package com.company;

public class Main {

    public static void main(String[] args) {
        PizzaBuilder pizMaker = new PizzaBuilder();
        pizMaker.SetTesto(Pizza.testoType.sausage);
        try {
            pizMaker.AddSmthToMyPiza("Sausage", 2);
        } catch (TooMuchWeightException | YouHaventChosenTestoException e) {
            e.printStackTrace();
        }
        try {
            pizMaker.AddSmthToMyPiza("Cheese", 3);
        } catch (YouHaventChosenTestoException | TooMuchWeightException e) {
            e.printStackTrace();
        }
        try {
            pizMaker.AddSmthToMyPiza("Mushrooms", 3);
        } catch (YouHaventChosenTestoException | TooMuchWeightException e) {
            e.printStackTrace();
        }
        try {
            pizMaker.AddSmthToMyPiza("Onion", 1);
        } catch (YouHaventChosenTestoException | TooMuchWeightException e) {
            e.printStackTrace();
        }
        System.out.println("Your pizza: " + pizMaker.toString());
    }
}
