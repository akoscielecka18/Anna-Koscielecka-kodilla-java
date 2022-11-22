package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;


public class StreamMain {
    public static void main(String[] args) {
      PoemBeautifier poemBeautifier = new PoemBeautifier();
      poemBeautifier.beautify("Ala has a cat", text -> text + " ABC");
      poemBeautifier.beautify("Ala has a cat", text -> "ABC " + text);
      poemBeautifier.beautify("ALa HaS A caT", text -> text.toLowerCase());
      poemBeautifier.beautify("Ala has a cat", text -> text.toUpperCase());
      poemBeautifier.beautify("Ala has a cat", text -> text.indent(3));
      poemBeautifier.beautify("Ala has a cat", text -> text.substring(7));
    }
}

