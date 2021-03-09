package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        // s4_11866
        // https://st-lab.tistory.com/197
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            q.offer(i);
        }
//        System.out.print("<");
        sb.append("<");
        while (q.size() >1) {
            for (int i = 0; i < K - 1; i++) {
                int now = q.poll();
                q.offer(now);
            }
//            System.out.print(q.poll()+", ");
            sb.append(q.poll()).append(", ");
        }
//        System.out.print(">");
        sb.append(q.poll()).append(">");
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
