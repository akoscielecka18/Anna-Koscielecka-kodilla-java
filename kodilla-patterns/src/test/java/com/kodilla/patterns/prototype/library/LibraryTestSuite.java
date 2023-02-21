package com.kodilla.patterns.prototype.library;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library");
        Book book1 = new Book("title1", "author1", LocalDate.of(1991, 10, 10));
        Book book2 = new Book("title2", "author2", LocalDate.of(1992, 9, 9));
        Book book3 = new Book("title3", "author3", LocalDate.of(1993, 8, 8));
        Book book4 = new Book("title4", "author4", LocalDate.of(1994, 7, 7));
        Book book5 = new Book("title5", "author5", LocalDate.of(1995, 6, 6));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);

        Library cloneLibrary = null;
        Library deepClone = null;

        try {
            cloneLibrary = library.shallowCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        try {
            deepClone = library.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);

        //Then
        assertEquals(cloneLibrary.getBooks().size(), 4);
        assertEquals(deepClone.getBooks().size(), 5);

    }
}
