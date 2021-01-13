package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    public static int row;
    public static int col;
    public static boolean[] visited;
    public static ArrayList<Integer>[] graph;
    public static Queue<Integer> q;

    public static void dfs(int startNodeNo) {
        visited[startNodeNo] = true;
        System.out.print(startNodeNo+" ");
        for (int args : graph[startNodeNo]) {
            if (visited[args] == false) {
                dfs(args);
            }
        }
    }

    public static void bfs(int startNodeNo) {
        q.add(startNodeNo);
        visited[startNodeNo] = true;
        while (q.isEmpty() == false) {
            int nowRemove = q.remove();
            System.out.print(nowRemove+" ");
            for (int args : graph[nowRemove]) {
                if (visited[args] == false) {
                    visited[args] = true;
                    q.add(args);
                }
            }
        }
    }

    public static void reset() {
        Arrays.fill(visited, false);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // 한줄로 row, col이 주어진다.
        System.out.println("row, col을 입력하세요 ");
        String[] s = bf.readLine().split(" ");
        row = Integer.parseInt(s[0]);
        col = Integer.parseInt(s[1]);
        System.out.println(row+", "+col);

        visited = new boolean[row+1];
        //Arrays.fill(visited, false);
        graph = new ArrayList[row+1];
        q = new LinkedList<>();
        for (int i=1; i<=row; i++) {
            graph[i] = new ArrayList<>();
        }

        //System.out.println(Arrays.deepToString(graph));

        graph[1].add(2);
        graph[1].add(3);
        graph[1].add(8);

        graph[2].add(1);
        graph[2].add(7);

        graph[3].add(1);
        graph[3].add(4);
        graph[3].add(5);

        graph[4].add(3);
        graph[4].add(5);

        graph[5].add(3);
        graph[5].add(4);

        graph[6].add(7);

        graph[7].add(2);
        graph[7].add(6);
        graph[7].add(8);

        graph[8].add(1);
        graph[8].add(7);

        dfs(1);
        reset();
        System.out.println(" ");
        bfs(1);
    }
}