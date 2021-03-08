package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static int n;
    public static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), "");
        n = Integer.parseInt(st.nextToken());
        int targetIndex = n;

        if (n == 0) {
            System.out.println(0);
            return;
        }
        else if (n == 1) {
            System.out.println(1);
            return;
        }

        arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i=2; i<arr.length; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(targetIndex);
        System.out.println(arr[targetIndex]);
    }
}