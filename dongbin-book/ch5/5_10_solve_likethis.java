package com.company;

import java.util.*;

public class Main {

    public static boolean visited[];
    public static ArrayList<Integer>[] graph;
    public static Queue<Integer> q;

    public static void dfs(int startNode) {
        visited[startNode] = true;
        System.out.print(startNode+" ");
        for (int graphArgs : graph[startNode]) {
            if (visited[graphArgs] == false) {
                dfs(graphArgs);
            }
        }
    }

    public static void bfs(int startNode) {
        q.add(startNode);
        visited[startNode] = true;
        while (q.isEmpty() == false) {
            int nowPoll = q.poll();
            System.out.print(nowPoll+" ");
            for (int graphArgs : graph[nowPoll]) {
                if (visited[graphArgs] == false) {
                    visited[graphArgs] = true;
                    q.add(graphArgs);
                }
            }
        }
    }

    public static void reset (int N) {
        for (int i =1; i<=N; i++) {
            visited[i] = false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int V = sc.nextInt();

        graph = (ArrayList<Integer>[]) new ArrayList[N+1];
        q = new LinkedList<Integer>();
        visited = new boolean[N+1];

        for (int i = 1; i<= N; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i< M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u].add(v);
            graph[v].add(u);
        }
        for (int i = 1; i<= N; i++) {
            Collections.sort(graph[i]);
        }
        dfs(V);
        reset(N);
        System.out.println("");
        bfs(V);
        sc.close();
    }
}