package com.company;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Math.pow;

class Main {
    public static void main(String[] args) throws IOException {
        // s5_2751
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int loopCount = Integer.parseInt(bf.readLine());
        ArrayList<Integer> ai = new ArrayList<>();
        TreeSet<Integer> ti = new TreeSet<>(ai);

        for (int i = 0; i < loopCount; i++) {
            ti.add(Integer.parseInt(bf.readLine()));
        }
        StringBuilder sb = new StringBuilder();
        ti.stream().forEach(i -> sb.append(i+"\n"));
        System.out.println(sb.toString());
//        ti.stream().forEach(i -> System.out.println(i));
//        System.out.println(ti.stream().);
    }
}

//class Solution {
//    public int solution(int s) {
//        String[] temp = Integer.toString(s).split("");
//        int result = 0;
//
//        for (int i=0 ; i < temp.length; i++) {
//            result = result + Integer.parseInt(temp[i].toString());
//        }
//
//        return result;
//    }
//}