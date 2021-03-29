package com.company;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Math.pow;

class Main {
    public static void main(String[] args) throws IOException {
        // b2_8958
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(bf.readLine());
        String[] tcs = new String[tc];

        for (int i = 0; i < tc; i++) {
            tcs[i] = bf.readLine();
        }
        int total = 0;
        int count = 0;
        for (String s : tcs) {
            total = 0;
            count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'O') {
                    total += ++count;
                }
                else {
                    count = 0;
                }
            }
            System.out.println(total);
        }
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