package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {
    @Test
    void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .BreadType(Muffin.ROLL)
                .Burgers(Burgers.TRIPLE)
                .SauceType(Sauce.STANDARD)
                .ingredient("Bacon")
                .ingredient("double chess")
                .ingredient("onion")
                .ingredient("tomato")
                .ingredient("salts")
                .ingredient("shrimps")
                .ingredient("mushrooms")
                .ingredient("cucumber")
                .build();
        System.out.println(bigmac);

        //When & Then
        assertEquals("roll", bigmac.getBreadType());
        assertEquals(3, bigmac.getBurgers());
        assertEquals("standard", bigmac.getSauceType());
        assertEquals(8, bigmac.getIngredients().size());
    }

}