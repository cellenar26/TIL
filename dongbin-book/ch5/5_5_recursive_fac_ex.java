package com.company;

import java.util.*;

public class Main {

    public static int recursive(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * recursive(n - 1);
    }

    public static void main(String[] args) {

        // recursion example
        System.out.println("start recursive");
        System.out.println("answer : "+recursive(5));
    }

}