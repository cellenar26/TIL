package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static int N;
    public static int dfs(int num) {
        if (num == 0) {
            return 1;
        }
        else if (num > 0) {
            return num * dfs(num - 1);
        }
        return 1;
    }

    public static void main(String[] args) throws IOException {

        // 첫 째 줄에 정수가 주어진다. 0<= N <= 12
        // N!의 결과를 출력한다.
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(),"");
        N = Integer.parseInt(st.nextToken());

        int result = dfs(N);
        System.out.println(result);
    }
}