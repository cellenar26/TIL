package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException{
        // s2_11279
	// https://dundung.tistory.com/108
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

        Queue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            int order = Integer.parseInt(bf.readLine());

            if (order == 0) {
                if (pq.isEmpty()) {
                    sb.append("0\n");
                }
                else {
                    sb.append(pq.poll() * -1 + "\n");
                }
            }
            else {
                pq.add(order * -1);
            }
        }
        System.out.println(sb.toString());
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
