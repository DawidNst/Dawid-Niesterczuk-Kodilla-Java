package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class Library extends Prototype<Library> {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = super.clone();
        clonedLibrary.books = new HashSet<>();
        for (Book b : books) {
            Book clonedBook = new Book(b.getTitle(), b.getAuthor(), b.getPublicationDate());
            clonedLibrary.getBooks().add(clonedBook);
        }
        return clonedLibrary;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Library library)) return false;
        return Objects.equals(getName(), library.getName()) && Objects.equals(getBooks(), library.getBooks());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getBooks());
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(name + "\n" +
                "Books: \n");
        for (Book theBook : books) {
            s.append("* ").append(theBook).append("\n");
        }
        return s.toString();
    }
}