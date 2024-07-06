package com.optionaljava8;

import java.util.Arrays;
import java.util.List;

public class OptionalEx {
    private static List<String> listOfBooks = Arrays.asList("Effective Java", "Clean Code", "Test Driven");
    public static String getBook(String letter) {
        String found = null;
        for (String book : listOfBooks) {
            if (book.startsWith(letter)) {
                found = book; break; } }
        return found != null ? found : "Book not Found";
    }

    public static void main(String[] args) {
        getBook("E");
    }



}
