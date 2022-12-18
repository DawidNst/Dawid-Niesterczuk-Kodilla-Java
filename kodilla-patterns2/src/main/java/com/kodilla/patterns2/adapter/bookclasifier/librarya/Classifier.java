package com.kodilla.patterns2.adapter.bookclasifier.librarya;

import java.util.Set;

public interface Classifier {
    int publicationYearMedian(Set<com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> bookSet);
}