package com.kodilla.patterns.strategy.social;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {
        //Given
        User steven = new Millenials("Mike");
        User john = new YGeneration("Kowalski");
        User jenny = new ZGeneration("Satoshi");

        //When
        String mikeShares = steven.share();
        System.out.println("Mike shares: " + mikeShares);
        String kowalskiShares = john.share();
        System.out.println("Kowalski shares: " + kowalskiShares);
        String satoshiShares = jenny.share();
        System.out.println("Satoshi shares: " + satoshiShares);

        //Then
        assertEquals("Facebook", mikeShares);
        assertEquals("Twitter", kowalskiShares);
        assertEquals("Snapchat", satoshiShares);
    }

    @Test
    void testIndividualSharingStrategy(){
        //Given
        User sarah = new ZGeneration("Sarah Harding");

        //When
        String sarahShares = sarah.share();
        System.out.println("Sarah shares: " + sarahShares);
        sarah.setSocialPublisher(new FacebookPublisher());
        sarahShares = sarah.share();
        System.out.println("Sarah shares: " + sarahShares);

        //Then
        assertEquals("Facebook", sarahShares);
    }
}