package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException{
        // s4_2164

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        LinkedList<Integer> ls = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            ls.add(i);
        }
//        System.out.println(ls.toString());
        boolean isDrop = true;
        while (ls.size() != 1) {
            if (isDrop == true) {
                ls.poll();
                isDrop = false;
            }
            else {
                int temp = ls.poll();
                ls.add(temp);
                isDrop = true;
            }

        }
        int result = ls.peekLast();
        System.out.println(result);
    }
}
//class Solution {
//    public String solution(int a, int b) {
//        String answer = "";
//        Calendar cal = new Calendar.Builder().setCalendarType("iso8601").setDate(2006, a - 1, b).build();
//        answer = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new Locale("ko-kr")).toUpperCase();
//        return answer;
//    }
//}
