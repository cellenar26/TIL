package com.company;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Math.pow;

class Main {
    public static void main(String[] args) throws IOException {
        // b2_2577
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(bf.readLine());
        int B = Integer.parseInt(bf.readLine());
        int C = Integer.parseInt(bf.readLine());

        int[] counter = new int[10];
        Arrays.fill(counter, 0);
        String[] temp = Integer.toString(A * B * C).split("");
        String[] li = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",};
        int resultSet = 0;
        // 17037300
        for (int i=0; i<temp.length; i++) {
            for (int j = 0; j < li.length; j++) {
                if (temp[i].equals(li[j])) {
                    counter[j]++;
                    break;
                }
            }
        }
//        System.out.println(Arrays.toString(counter));
        for (int i = 0; i < li.length; i++) {
            System.out.println(counter[i]);
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