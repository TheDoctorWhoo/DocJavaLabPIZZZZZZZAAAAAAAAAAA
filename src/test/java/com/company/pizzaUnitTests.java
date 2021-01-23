package com.company;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class pizzaUnitTests {
    @Test
    void FirstUnitTest(){
        Pizza testPizza = new Pizza(Pizza.testoType.sausage);
        boolean checker = testPizza.AddIngredient("Perviy", 2560);
        assertFalse(checker);
    }
    @Test
    void RegularUnitTest() throws YouHaventChosenTestoException, TooMuchWeightException {
        Pizza testPizza = new Pizza(Pizza.testoType.sausage);
        testPizza.AddIngredient("Колбаса", 2*58);
        testPizza.AddIngredient("Сыр", 3*58);
        testPizza.AddIngredient("Грибы", 3*58);
        testPizza.AddIngredient("лук", 1*58);
        assertEquals(340+116+174+174+58, testPizza.getVes());
    }
    @Test
    void VesExceptionUnitTest() throws YouHaventChosenTestoException, TooMuchWeightException {
        PizzaBuilder pizMaker = new PizzaBuilder();
        pizMaker.SetTesto(Pizza.testoType.sausage);
        pizMaker.AddSmthToMyPiza("Колбаса", 2);
        pizMaker.AddSmthToMyPiza("Сыр", 3);
        pizMaker.AddSmthToMyPiza("Грибы", 3);
        assertThrows(TooMuchWeightException.class, () -> pizMaker.AddSmthToMyPiza("лук", 25));
    }
}
