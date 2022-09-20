package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final BigDecimal peopleQuantity;
    private final String countryName;

    public Country(String name, BigDecimal amountOfPl)
    {
        this.peopleQuantity=amountOfPl;
        this.countryName=name;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    public String getCountryName() {
        return countryName;
    }
}
