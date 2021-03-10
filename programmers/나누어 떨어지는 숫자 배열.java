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
        int[] arrr = {5, 9, 7, 10};
        int div = 5;
        System.out.println(s.solution(arrr,div));
    }
}
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        ArrayList<Integer> ai = new ArrayList<>();
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                ai.add(arr[i]);
                result++;
            }
        }
        if (result == 0) {
            answer = new int[]{-1};
        }
        else {

            answer = new int[ai.size()];
            for (int i = 0; i < ai.size(); i++) {
                answer[i] = ai.get(i);
            }
        }
//        System.out.println(Arrays.toString(answer));
        Arrays.sort(answer);
        return answer;
    }
}