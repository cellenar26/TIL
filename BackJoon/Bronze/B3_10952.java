package com.company;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Math.pow;
import static java.lang.Math.toRadians;

class Main {
    public static void main(String[] args) throws IOException {
        // b3_10952
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int first = 0;
        int second = 0;
        String[] temps = new String[2];
        boolean flag = true;

        while(flag == true) {
            temps = bf.readLine().split(" ");
            first = Integer.parseInt(temps[0]);
            second = Integer.parseInt(temps[1]);
            if (first == 0 && second == 0) {
                break;
            }
            System.out.println(first+second);
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