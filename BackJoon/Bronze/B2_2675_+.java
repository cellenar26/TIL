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
    public static void main(String[] args) throws IOException{
        // B2_2675
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int roof = Integer.parseInt(st.nextToken());
            String sss = st.nextToken();

            for (int j = 0; j < sss.length(); j++) {
                for (int k = 0; k < roof; k++) {
                    System.out.print(sss.charAt(j));
                }
            }
            System.out.println();
        }
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
