package com.company;

public class PizzaBuilder {
    private Pizza myPizza;
    private boolean testoSet = false;
    public void SetTesto(Pizza.testoType typeOfTesto){
        myPizza = new Pizza(typeOfTesto);
        testoSet = true;
    }
    public void AddSmthToMyPiza(String Name, Integer howMuch) throws TooMuchWeightException, YouHaventChosenTestoException {
        if(testoSet){
            if(!myPizza.AddIngredient(Name, howMuch*58)){//each portion = 58gr
                throw new TooMuchWeightException();
            }else{
                System.out.println("Вес вашей пиццы составляет: "+myPizza.getVes());
            }
        }else{
            throw new YouHaventChosenTestoException();
        }
    }
    public void clean(){
        myPizza.cleanup();
    }
    @Override
    public String toString() {
        return myPizza.toString();
    }
}
