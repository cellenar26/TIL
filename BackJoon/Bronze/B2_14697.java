package com.company;

import java.awt.desktop.SystemSleepEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    // B2_14697
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int oneRoom = Integer.parseInt(st.nextToken());
        int twoRoom = Integer.parseInt(st.nextToken());
        int threeRoom = Integer.parseInt(st.nextToken());
        int students = Integer.parseInt(st.nextToken());
        int result = 0;
        for (int i=0; i<=50; i++) {
            for (int j=0; j<=50; j++) {
                for (int k=0; k<=50; k++) {
                    if (oneRoom*i+twoRoom*j+threeRoom*k==students) {
                        result = 1;
                    }
                }
            }
        }
        System.out.println(result);
    }
}