package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    // B2_2292
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int N = Integer.parseInt(bf.readLine());
        int count = 1;
        int range = 2;
        if (N == 1) {
            System.out.println(1);
        }
        else {
            while (range <= N) {
                range = range + count*6;
                count++;
            }
            System.out.println(count);
        }

    }
}