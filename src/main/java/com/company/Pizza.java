package com.company;

import javafx.util.Pair;
import lombok.Getter;

import java.util.ArrayList;

public class Pizza{
    private final testoType testo;
    private ArrayList<Pair<String, Integer>> Ingredients;
    @Getter private Integer Ves;
    private Integer maxVes;

    public Pizza(testoType testo) {
        this.testo = testo;
        Ingredients = new ArrayList<>();
        maxVes = 1276;
        switch (testo) {
            case classic -> {
                Ves = 200;
                break;
            }
            case italian -> {
                Ves = 130;
                break;
            }
            case sausage -> {
                Ves = 340;
                break;
            }
            case italCheese -> {
                Ves = 186;
                break;
            }
            default -> throw new IllegalStateException("Unexpected value: " + testo);
        }
    }

    public boolean AddIngredient(String ingredientName, Integer gramms) {
        if (Ves + gramms <= maxVes) {
            Ingredients.add(new Pair<>(ingredientName, gramms));
            Ves += gramms;
            return true;
        } else return false;
    }

    public void cleanup(){
        Ingredients.clear();
        switch (testo) {
            case classic -> {
                Ves = 200;
                break;
            }
            case italian -> {
                Ves = 130;
                break;
            }
            case sausage -> {
                Ves = 340;
                break;
            }
            case italCheese -> {
                Ves = 186;
                break;
            }
            default -> throw new IllegalStateException("Unexpected value: " + testo);
        }
        System.out.println("Ваша пицца очищена.");
    }

    @Override
    public String toString() {
        return "Тесто:" + testo +
                ",\nИнгредиенты: " + Ingredients +
                ",\nИтоговый вес пиццы: " + Ves +
                "\nПриятного аппетита! Приходите еще!";
    }
    public enum testoType {
        classic,
        italian,
        sausage,
        italCheese
    }

}
