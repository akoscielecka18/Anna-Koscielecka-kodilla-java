package com.kodilla.testing.library;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import static org.testng.AssertJUnit.assertEquals;

@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {
    @Mock
    private LibraryDatabase libraryDatabaseMock;
    @Test
    void testListBooksWithConditionsReturnList() {
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());

    }
    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    void testListBooksWithConditionMoreThan20() {
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    void testListBooksInHandsOf(){
        //given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> listBooksInHandsOf0 = new ArrayList<>();
        List<Book> listBooksInHandsOf1 = generateListOfNBooks(1);
        List<Book> listBooksInHandsOf5 = generateListOfNBooks(5);

        LibraryUser libraryUser1 = new LibraryUser("Ann", "Smith", "456");
        LibraryUser libraryUser2 = new LibraryUser("Paul", "Jones", "789");
        LibraryUser libraryUser3 = new LibraryUser("Tom", "Williams", "123");

        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser1))
                .thenReturn(listBooksInHandsOf0);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser2))
                .thenReturn(listBooksInHandsOf1);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser3))
                .thenReturn(listBooksInHandsOf5);

        //when
        List<Book> inHands0 = bookLibrary.listBooksInHandsOf(libraryUser1);
        List<Book> inHands1 = bookLibrary.listBooksInHandsOf(libraryUser2);
        List<Book> inHands5 = bookLibrary.listBooksInHandsOf(libraryUser3);

        //then
        assertEquals(0, inHands0.size());
        assertEquals(1, inHands1.size());
        assertEquals(5, inHands5.size());
    }
}
