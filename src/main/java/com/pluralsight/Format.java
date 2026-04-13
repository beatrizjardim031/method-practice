package com.pluralsight;

public class Format {
//  Exercise 1 part 4

    public static String formatName(String last, String first) {
        return last + ", " + first;

    }

    public static void main(String[] args) {
        String result = formatName("Jardim", "Beatriz");
        System.out.println(result);
    }


}
