package com.pluralsight;

public class Hello {
//  Exercise 1 part 2 (a-e)

//  In this exercise I'm defining methods, the main method is where I call the methods I defined
    public static void sayHello() {
        System.out.println ("Hello, World!");
    }

    public static void sayGoodbye() {
        System.out.println("Goodbye!");
    }

    public static void sayGoodMorning() {
        System.out.println("Good Morning!");
    }

    public static void main(String[] args) {
        sayHello();
        sayGoodbye();
        sayGoodMorning();
    }
}

