package com.company;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Math.pow;

class Main {
    public static void main(String[] args) throws IOException {
        // b2_3052
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> nai = new ArrayList<>();
        TreeSet<Integer> ti = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            nai.add(Integer.parseInt(bf.readLine()) % 42);
            ti.add(nai.get(i));
        }
        // 정렬을 한다.
//        Collections.sort(ai);
//        System.out.println(Arrays.toString(ti.toArray()));
        System.out.println(ti.size());
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