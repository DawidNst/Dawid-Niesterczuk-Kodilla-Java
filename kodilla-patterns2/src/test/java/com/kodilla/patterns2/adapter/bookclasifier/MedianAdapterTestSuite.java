package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Andrzej Sapkowski", "Wiedźmin", 2000, "1"));
        bookSet.add(new Book("J.R.R. Tolkien", "Władca Pierścieni", 2002, "2"));
        bookSet.add(new Book("Kathy Sierra, Bert Bates", "Java. Rusz głową", 2003, "3"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int median = medianAdapter.publicationYearMedian(bookSet);
        //Then
        assertEquals(2002, median);
    }
}