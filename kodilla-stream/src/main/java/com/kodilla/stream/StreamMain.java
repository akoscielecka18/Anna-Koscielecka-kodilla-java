package com.kodilla.stream;


//import com.kodilla.stream.beautifier.PoemBeautifier;
//import com.kodilla.stream.beautifier.PoemDecorator;
//import com.kodilla.stream.book.Book;
//import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
//import com.kodilla.stream.iterate.NumbersGenerator;
//import com.kodilla.stream.person.People;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {
//      PoemBeautifier poemBeautifier = new PoemBeautifier();
//      poemBeautifier.beautify("Ala has a cat", text -> text + " ABC");
//      poemBeautifier.beautify("Ala has a cat", text -> "ABC " + text);
//      poemBeautifier.beautify("ALa HaS A caT", text -> text.toLowerCase());
//      poemBeautifier.beautify("Ala has a cat", text -> text.toUpperCase());
//      poemBeautifier.beautify("Ala has a cat", text -> text.indent(3));
//      poemBeautifier.beautify("Ala has a cat", text -> text.substring(7));
//
//      System.out.println("Using Stream to generate even numbers from 1 to 20");
//      NumbersGenerator.generateEven(20);


//      People.getList().stream()
//              .map(String::toUpperCase)
//              .filter(s -> s.length() > 11)
//              .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
//              .filter(s -> s.substring(0, 1).equals("M"))
//              .forEach(System.out::println);


//        BookDirectory theBookDirectory = new BookDirectory();
//        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toMap(Book::getSignature, book -> book));
//
//        System.out.println("# elements: " + theResultMapOfBooks.size());
//        theResultMapOfBooks.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue())
//                .forEach(System.out::println);


        Map<Integer, ForumUser> theResultMapOfUsers = Forum.getUserList().stream()
                .filter(s ->s.getSex() == 'M')
                .filter(s ->s.getLocalDate().getYear() <= 2002)
                .filter(s -> s.getPostNumber() > 0)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}


