package com.company;

import java.util.*;

public class Main {

    public static boolean[] visited = new boolean[9];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    // DFS
    public static void dfs(int x) {
        // 현재 노드 방문 처리
        visited[x] = true;
        System.out.print(x+ " ");
        // 현재 노드와 연결된 다른 노드를 재귀적 방문
        for(int i = 0; i < graph.get(x).size(); i++) {
            int y = graph.get(x).get(i);
            if (visited[y] == false) {
                dfs(y);
            }
        }
    }

    // BFS
    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        // 현재 노드를 방문처리 한다.
        visited[start] = true;
        // 큐가 빌 때까지 반복
        while (q.isEmpty() == false) {
            // 큐에서 하나의 원소를 뽑아서 출력한다.
            int x = q.remove();
            System.out.println(x +" ");
            // 해당 원소와 연결됐고, 방문하지 않은 원소들을 큐에 삽입한다.
            for (int i = 0; i < graph.get(x).size(); i++) {
                int y = graph.get(x).get(i);
                if(visited[y] == false) {
                    q.add(y);
                    visited[y] = true;
                }
            }
        }
    }

    public static void main(String[] args) {

        // graph init
        for(int i = 0; i< 9; i++) {
            graph.add(new ArrayList<>());
        }

        // node 1
        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(8);

        // node 2
        graph.get(2).add(1);
        graph.get(2).add(7);

        // node 3
        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);

        // node 4
        graph.get(4).add(3);
        graph.get(4).add(5);

        // node 5
        graph.get(5).add(3);
        graph.get(5).add(4);

        // node 6
        graph.get(6).add(7);

        // node 7
        graph.get(7).add(2);
        graph.get(7).add(6);
        graph.get(7).add(8);

        // node 8
        graph.get(8).add(1);
        graph.get(8).add(7);

        //dfs(1);
        bfs(1);

    }

}