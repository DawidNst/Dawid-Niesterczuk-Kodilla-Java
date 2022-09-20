package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        ArrayList<Country> europeanCountries = new ArrayList<>();
        europeanCountries.add(new Country("Poland", new BigDecimal(3790000)));
        europeanCountries.add(new Country("Germany", new BigDecimal(3990000)));
        europeanCountries.add(new Country("Norweay", new BigDecimal(790500)));
        europeanCountries.add(new Country("Switzerland", new BigDecimal(32689156)));

        ArrayList<Country> austrailianCountries = new ArrayList<>();

        austrailianCountries.add(new Country("Sydney", new BigDecimal(589658)));
        austrailianCountries.add(new Country("Melbourne", new BigDecimal(98258)));
        austrailianCountries.add(new Country("Perth", new BigDecimal(145900)));
        austrailianCountries.add(new Country("Canberra", new BigDecimal(298561)));

        ArrayList<Country> northAmericaCountries = new ArrayList<>();

        northAmericaCountries.add(new Country("California", new BigDecimal(26987456)));
        northAmericaCountries.add(new Country("Canvas", new BigDecimal(269741)));
        northAmericaCountries.add(new Country("Miami", new BigDecimal(825697)));
        northAmericaCountries.add(new Country("Chicago", new BigDecimal(3389658)));

        ArrayList<Country> southAmericaCountries = new ArrayList<>();

        southAmericaCountries.add(new Country("Peru", new BigDecimal(26987456)));
        southAmericaCountries.add(new Country("Chile", new BigDecimal(98521478)));
        southAmericaCountries.add(new Country("Brazil", new BigDecimal(55589658)));
        southAmericaCountries.add(new Country("Mexico", new BigDecimal(589621)));

        ArrayList<Country> asiaCountries = new ArrayList<>();
        asiaCountries.add(new Country("Indie", new BigDecimal(7456989)));
        asiaCountries.add(new Country("China", new BigDecimal(12587965)));
        asiaCountries.add(new Country("Taiwan", new BigDecimal(589654123)));
        asiaCountries.add(new Country("Japan", new BigDecimal(56985478)));


        List<Continent> continentList = new ArrayList<>();
        continentList.add(new Continent("Europe", europeanCountries));
        continentList.add(new Continent("Australia", austrailianCountries));
        continentList.add(new Continent("NorthAmerica", northAmericaCountries));
        continentList.add(new Continent("SouthAmerica", southAmericaCountries));
        continentList.add(new Continent("Asia", asiaCountries));

        World world = new World(continentList);
        //When
        BigDecimal worldPeopleQuantity = world.getPeopleQuantity();
        System.out.println(worldPeopleQuantity);
        BigDecimal expectedPeopleQuantity = new BigDecimal("");
        //Then
        Assertions.assertEquals(expectedPeopleQuantity, worldPeopleQuantity);


    }
}