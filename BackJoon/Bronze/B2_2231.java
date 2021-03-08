package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    // B2_2231
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int result = 0;
        int X = 0;
        int temp = 0;
        String[] sts;
        for (int i=1; i<=1000000; i++) {
            X = i;
            sts = String.valueOf(X).split("");

            for (String s : sts) {
                X = X + Integer.parseInt(s);
            }
            if (X == N) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}