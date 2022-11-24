package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity(){
        //given
        World world = new World();
        Continent europa = new Continent("Europa");
        europa.addCountry(new Country("Poland", new BigDecimal("1007")));
        europa.addCountry(new Country("Germany", new BigDecimal("1548")));
        europa.addCountry(new Country("Italy", new BigDecimal("1857")));
        europa.addCountry(new Country("Norway", new BigDecimal("7418")));
        europa.addCountry(new Country("Hungary", new BigDecimal("7418")));
        europa.addCountry(new Country("Slovenia", new BigDecimal("8528")));
        world.addContinents(europa);

        Continent africa = new Continent("Africa");
        africa.addCountry(new Country("Algeria", new BigDecimal("7418")));
        africa.addCountry(new Country("Egypt", new BigDecimal("89654")));
        africa.addCountry(new Country("Mali", new BigDecimal("74185")));
        world.addContinents(africa);

        Continent northAmerica = new Continent("North America");
        northAmerica.addCountry(new Country("USA", new BigDecimal("8585")));
        northAmerica.addCountry(new Country("Mexico", new BigDecimal("852456")));
        northAmerica.addCountry(new Country("Canada", new BigDecimal("1236")));
        world.addContinents(northAmerica);

        //when
        BigDecimal people = world.getPeopleQuantityInTheWord();
        //then
        assertEquals(people, new BigDecimal("1061310"));


    }
}
