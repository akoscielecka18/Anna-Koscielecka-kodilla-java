package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    
    private final String nameOfCountry;
    private final BigDecimal quantityOfPeople;

    public Country(final String nameOfCountry, final BigDecimal quantityOfPeople) {
        this.nameOfCountry = nameOfCountry;
        this.quantityOfPeople = quantityOfPeople;
    }

    public BigDecimal getQuantityOfPeople() {
        return quantityOfPeople;
    }
}
