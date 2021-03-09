package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 프로그래머스_K번째수
        // https://sas-study.tistory.com/3
        Solution s = new Solution();
        int[] argss = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] using = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(s.solution(argss, using)));
    }
}
class Solution {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0 ;

        for(int i = 0 ; i < commands.length ; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int k = commands[i][2];

            int[] tmp = new int[end - start + 1];

            int a = 0;
            for(int j = start - 1 ; j < end ; j++) {
                tmp[a++] = array[j];
            }

            Arrays.sort(tmp);
            answer[i] = tmp[k-1];
        }
        return answer;
    }
}
