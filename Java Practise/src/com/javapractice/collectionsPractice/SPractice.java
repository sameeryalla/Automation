package com.javapractice.collectionsPractice;

import java.util.*;

public class SPractice {
    public static void main(String[] args) {
        /*LIFO - Last in Firstout - Stack
        FIFO - First in Fist out  - Queue

        Stack is a class which implements List interface & extended the vector & also represents the
        LIFO principle
         */
        Stack<String> books=new Stack();
        books.add("Red Book");
        books.add("Green Book");
        books.add(0,"white Book");
        System.out.println(books);
        books.remove(0);
        books.set(0, "Yellow Book");
        System.out.println(books.get(0));
        System.out.println(books.contains("Green Book"));

        Stack<String> books2=new Stack();
        books2.push("Red Book");
        books2.push("Green Book");
        books2.push("Black Book");
        books2.push("White Book");
        System.out.println("Peek method result is "+books2.peek());
        System.out.println("Pop method result is "+books2.pop());
        System.out.println("After POP result: "+books2);
        System.out.println("Search method result: "+books2.search("Black Book"));
        System.out.println("Search method with index result: "+books2.indexOf("Black Book"));
    }
}
