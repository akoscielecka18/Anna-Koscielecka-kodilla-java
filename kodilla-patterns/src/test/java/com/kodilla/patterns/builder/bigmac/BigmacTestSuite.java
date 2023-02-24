package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {
    @Test
    void testBigMacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Roll with sesame seeds")
                .burgers(2)
                .sauce("Barbecue")
                .ingredients("Bacon")
                .ingredients("Onion")
                .ingredients("Lettuce")
                .build();

        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        assertEquals(howManyIngredients, 3);
    }

}
