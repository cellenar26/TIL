package com.company;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 프로그래머스_문자열 내림차순으로 배치하기
        Solution s = new Solution();

        System.out.println(s.solution("Zbcdefg"));
    }
}
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] temp = s.toCharArray();
        char min = temp[0];

        for (int i = 0; i < s.length()-1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (temp[i] < temp[j]) {
                    char ttemp = temp[j];
                    temp[j] = temp[i];
                    temp[i] = ttemp;
                }
            }
        }
//        System.out.println(Arrays.toString(temp));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < temp.length; i++) {
            sb.append(temp[i]);
        }
        answer = sb.toString();
        return answer;
    }
}