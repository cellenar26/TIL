package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(bf.readLine(), " ");
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = search(arr, N, M);
        System.out.println(result);
    }

    public static int search(int[] arrs, int cards, int target) {
        int result =0;

        for (int i=0; i<cards-2; i++) {
            for (int j=i+1; j<cards-1; j++) {
                for (int k=j+1; k<cards; k++) {
                    int temp = arrs[i] + arrs[j] + arrs[k];
                    if (target == temp) {
                        return temp;
                    }
                    if (result < temp && temp < target) {
                        result = temp;
                    }
                }
            }
        }
        return result;
    }
}