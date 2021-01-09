package com.company;

import java.util.*;

public class Main {

    public static int[][] maps = new int[50][50];
    public static int[][] visits = new int[50][50];

    public static void main(String[] args) {

        Stack<Integer> stacs = new Stack<>();
        System.out.println("stack is empty? : "+stacs.empty());
        stacs.push(0);
        stacs.push(1);
        stacs.push(2);
        stacs.push(3);
        stacs.push(4);
        System.out.println("stack is empty? : "+stacs.empty());

        System.out.println("stack peek : "+ stacs.peek());
        System.out.println("stack peek : "+ stacs.peek());
        System.out.println("stack is empty? : "+stacs.empty());

        System.out.println("stack pop : "+stacs.pop());
        System.out.println("stack pop : "+stacs.pop());
        System.out.println("stack pop : "+stacs.pop());
        System.out.println("stack pop : "+stacs.pop());
        System.out.println("stack pop : "+stacs.pop());
        System.out.println("stack is empty? : "+stacs.empty());

    }

}