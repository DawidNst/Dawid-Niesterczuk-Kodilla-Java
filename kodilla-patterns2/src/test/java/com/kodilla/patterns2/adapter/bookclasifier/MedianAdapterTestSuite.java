package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;


import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest(){
        //Given
        Set<Book> book = new HashSet<>();
        book.add(new Book("Andrzej Sapkowski", "Wiedźmin", 2000, "1"));
        book.add(new Book("J.R.R. Tolkien", "Władca Pierścieni", 2002, "2"));
        book.add(new Book("Kathy Sierra, Bert Bates", "Java. Rusz głową", 2003, "3"));

        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int median = medianAdapter.publicationYearMedian(book);
        //Then
        assertEquals(2002, median);

    }
}