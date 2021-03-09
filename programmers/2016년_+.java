package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        // 프로그래머스_2016년
        int month = 5;
        int D = 24;
        Solution s = new Solution();
        System.out.println(s.solution(month, D));

    }

}
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        Calendar cal = new Calendar.Builder().setCalendarType("iso8601").setDate(2006, a - 1, b).build();
        answer = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new Locale("ko-kr")).toUpperCase();
        return answer;
    }
}
// 출처: https://moonong.tistory.com/18