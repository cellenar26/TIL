package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    // B2_2309
    // 배열 요소들의 합을 구함
    public static int sum(int[] arrs) {
        int result = 0;
        for (int i=0; i<9; i++) {
            result = result + arrs[i];
        }
        return result;
    }
    public static int[] nomes = {};

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        nomes = new int[9];
        for (int i = 0; i<9; i++) {
            nomes[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(nomes);

        int arrsSum = sum(nomes);

        for (int i = 0; i< nomes.length-1; i++) {
            for (int j = i+1; j< nomes.length; j++) {
                if ((arrsSum - (nomes[i]+nomes[j])) == 100) {
//                    nomes[i] = -1;
//                    nomes[j] = -1;
                    for (int k=0; k<9; k++) {
                        if (k == i || k == j) {
                            continue;
                        }
                        System.out.println(nomes[k]);
                    }
                    System.exit(0);
                }
            }
        }
    }
}