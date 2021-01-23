package com.company;

public class Main {

    public static void main(String[] args) {
        PizzaBuilder pizMaker = new PizzaBuilder();
        pizMaker.SetTesto(Pizza.testoType.sausage);
        try {
            pizMaker.AddSmthToMyPiza("Колбаса", 25);
        } catch (TooMuchWeightException | YouHaventChosenTestoException e) {
            e.printStackTrace();
        }
        try {
            pizMaker.AddSmthToMyPiza("Сыр", 3);
        } catch (YouHaventChosenTestoException | TooMuchWeightException e) {
            e.printStackTrace();
        }
        try {
            pizMaker.AddSmthToMyPiza("Грибы", 3);
        } catch (YouHaventChosenTestoException | TooMuchWeightException e) {
            e.printStackTrace();
        }
        try {
            pizMaker.AddSmthToMyPiza("лук", 1);
        } catch (YouHaventChosenTestoException | TooMuchWeightException e) {
            e.printStackTrace();
        }
        System.out.println("Ваша пицца: " + pizMaker.toString());
    }
}
