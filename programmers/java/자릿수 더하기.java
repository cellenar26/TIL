package com.company;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Math.pow;

class Main {
    public static void main(String[] args) throws IOException {
        //
        Solution s = new Solution();

        System.out.println(s.solution(123));
        System.out.println(s.solution(987));

    }
}
class Solution {
    public int solution(int s) {
        String[] temp = Integer.toString(s).split("");
        int result = 0;

        for (int i=0 ; i < temp.length; i++) {
            result = result + Integer.parseInt(temp[i].toString());
        }

        return result;
    }
}