package main.java.com.company;

import javafx.util.Pair;

import java.util.ArrayList;

public class Pizza {
    private testoType testo;
    private ArrayList<Pair<String, Integer>> Ingredients;
    private Integer ves;
    private Integer maxVes;

    public Pizza(testoType testo) {
        this.testo = testo;
        Ingredients = new ArrayList<>();
        maxVes = 1276;
        switch (testo) {
            case classic -> {
                ves = 200;
                break;
            }
            case italian -> {
                ves = 130;
                break;
            }
            case sausage -> {
                ves = 340;
                break;
            }
            case italCheese -> {
                ves = 186;
                break;
            }
            default -> throw new IllegalStateException("Unexpected value: " + testo);
        }
    }

    public boolean AddIngradient(String IngradientName, Integer gramms) {
        if (ves + gramms <= maxVes) {
            Ingredients.add(new Pair<>(IngradientName, gramms));
            ves += gramms;
            return true;
        } else return false;
    }

    public void setTesto(testoType testo) {
        this.testo = testo;
    }

    public Integer getVes() {
        return ves;
    }

    @Override
    public String toString() {
        return "Тесто:" + testo +
                ",\nИнгредиенты: " + Ingredients +
                ",\nИтоговый вес пиццы: " + ves +
                "\nПриятного аппетита! Приходите еще!";
    }
    public enum testoType {
        classic,
        italian,
        sausage,
        italCheese
    }

}
