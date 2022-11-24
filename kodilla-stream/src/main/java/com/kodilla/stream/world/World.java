package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final List<Continent> continentsList = new ArrayList<>();

    public List<Continent> getContinentsList() {
        return continentsList;
    }
    public void addContinents(Continent continent) {
        continentsList.add(continent);
    }

    public BigDecimal getPeopleQuantityInTheWord(){
        return continentsList.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(country -> country.getQuantityOfPeople())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
