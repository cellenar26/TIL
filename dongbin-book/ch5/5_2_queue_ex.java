package com.company;

import java.util.*;

public class Main {

    public static int[][] maps = new int[50][50];
    public static int[][] visits = new int[50][50];

    public static void main(String[] args) {

        Queue<Integer> ques = new LinkedList<>();
        System.out.println("que empty? : "+ques.isEmpty());

        ques.add(0);
        ques.add(1);
        ques.add(2);
        ques.add(3);
        ques.add(4);
        System.out.println("que empty? : "+ques.isEmpty());

        System.out.println("que : "+ques.peek());
        System.out.println("que : "+ques.peek());
        System.out.println();

        System.out.println("que : "+ques.remove());
        System.out.println("que : "+ques.remove());
        System.out.println("que : "+ques.remove());
        System.out.println("que : "+ques.remove());
        System.out.println("que : "+ques.remove());
        System.out.println("que empty? : "+ques.isEmpty());
    }

}