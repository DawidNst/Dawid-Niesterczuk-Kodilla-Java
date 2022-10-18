package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {
    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("Library book");
        String title = "Think ";
        String author = "Ghost";
        LocalDate now = LocalDate.now();
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n ->library.getBooks().add(new Book(title + n, author, now.minusYears(n))));

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library second");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Librarythree");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        clonedLibrary.getBooks().remove(new Book(title + 3, author, now.minusYears(3) ));

        //Then
        assertEquals(9, library.getBooks().size());
        assertEquals(9, clonedLibrary.getBooks().size());
        assertEquals(10, deepClonedLibrary.getBooks().size());
    }
}