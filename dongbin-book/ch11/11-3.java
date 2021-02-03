package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bf.readLine().split("");
        boolean flag = false;
        int count = 0;
        int head = Integer.parseInt(s[0]);

        for (String temp : s) {

            if (flag == false) {
                if (head != Integer.parseInt(temp)) {
                    flag = true;
                    count++;
                }
            }
            else {
                if (head == Integer.parseInt(temp)) {
                    flag = false;
                }
            }
        }
        System.out.println(count);
    }
}