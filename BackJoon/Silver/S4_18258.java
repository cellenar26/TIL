package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException{
        // s4_18258
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> qq = new LinkedList<>();

        int N = Integer.parseInt(bf.readLine());
        int lastV = 0;

        StringBuilder sb = new StringBuilder();
//        sb.append("one");
//        sb.append("two");
//        sb.append("three");
//        System.out.println(sb.toString());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            switch (st.nextToken()) {
                case "push":
                    int now = Integer.parseInt(st.nextToken());
                    qq.add(now);

                    break;
                case "pop":
                    if (qq.isEmpty() == true) {
//                        System.out.println(-1);
                        sb.append("-1\n");
                    }
                    else {
//                         System.out.println(qq.poll());
                        sb.append(qq.poll()+"\n");
                    }
                    break;
                case "empty":
                    if (qq.isEmpty() == true) {
//                         System.out.println(1);
                        sb.append("1\n");
                    }
                    else {
//                        System.out.println(0);
                        sb.append("0\n");
                    }
                    break;
                case "size":
//                     System.out.println(qq.size());
                    sb.append(qq.size()+"\n");
                    break;
                case "front":
                    if (qq.isEmpty() == true) {
//                         System.out.println(-1);
                        sb.append("-1\n");
                    }
                    else {
//                         System.out.println(qq.peek());
                        sb.append(qq.peek()+"\n");
                    }
                    break;
                case "back":
                    if (qq.isEmpty() == true) {
//                         System.out.println(-1);
                        sb.append("-1\n");
                    }
                    else {
//                         System.out.println(qq.peekLast());
                        sb.append(qq.peekLast()+"\n");
                    }
                    break;
                default:
                    break;
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
