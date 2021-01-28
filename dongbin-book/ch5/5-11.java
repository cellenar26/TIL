package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

class Node {
    private int index;
    private int distance;

    public Node(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    public int getIndex() {
        return this.index;
    }

    public int getDistance() {
        return this.distance;
    }
}

public class Main {

    public static int N;
    public static int M;
    public static int dx[] = {-1, 1, 0, 0}; // 상,하
    public static int dy[] = {0, 0, -1, 1}; // 좌,우
    public static int[][] graph = new int[201][201];

    public static int bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x,y));
        // 큐가 빌 때까지 반복할 것
        while (q.isEmpty() == false) {
            Node node = q.remove();
            x = node.getIndex();
            y = node.getDistance();
            // 현재 위치에서 4가지 방향으로의 위치 확인
            for (int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                // 미로 공간을 벗어나면 무시
                if (nx < 0 || nx >= N || ny <0 || ny >= M) continue;
                // 벽이면 무시
                if (graph[nx][ny] == 0) {
                    continue;
                }
                // 해당 노드를 처음 방문하는 경우에만 최단 거리 기록
                if (graph[nx][ny] == 1) {
                    graph[nx][ny] = graph[x][y] + 1;
                    q.offer(new Node(nx, ny));
                }
            }
        }
        return graph[N-1][M-1];
    }

    public static void main(String[] args) throws IOException {

        System.out.println("n*m을 입력해주세요");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] nAndM = bf.readLine().split(" ");
        N = Integer.parseInt(nAndM[0]);
        M = Integer.parseInt(nAndM[1]);
        System.out.println("미로판을 입력해주세요");
        for (int i=0; i<N; i++) {
            String[] temp = bf.readLine().split("");
            for (int j=0; j<M; j++) {
                graph[i][j] = Integer.parseInt(temp[j]);
            }
        }
        System.out.println(bfs(0,0));
    }
}