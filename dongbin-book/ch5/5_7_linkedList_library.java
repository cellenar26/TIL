package com.company;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        LinkedList<String> linkedListString = new LinkedList<>();
        linkedListString.add("one");
        linkedListString.add("two");
        linkedListString.add("three");
        System.out.println(linkedListString.pop());
        System.out.println(linkedListString.remove());
        System.out.println(linkedListString.removeFirst());
        System.out.println(linkedListString.isEmpty());
    }

}