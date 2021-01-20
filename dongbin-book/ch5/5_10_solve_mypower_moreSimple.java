package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    public static int row;
    public static int column;

    public static int[][] graph = {};

    public static boolean dfs(int rowX, int columnY) {

        // 현재 좌표가 범위를 벗어났는가
        if (rowX <= -1 || rowX >= row || columnY <= -1 || columnY >= column) {
            return false;
        }
        // 현재 좌표에 해당하는 얼음판이 방문처리가 아니라면 dfs시작
        if (graph[rowX][columnY] == 0) {
            graph[rowX][columnY] = 1;
            // 상하좌우 탐색 시작

            dfs(rowX-1, columnY);
            dfs(rowX, columnY-1);
            dfs(rowX+1, columnY);
            dfs(rowX, columnY+1);

            return true;
        }
        return false;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("세로와 가로길이를 입력");
        // 첫 번째 줄에 세로 길이 N과 가로 길이 M이 주어진다.
        // 두 번쩨 얼음 틀의 형태가 한줄씩주어진다.
        // 이 때 구멍이 뚫린 곳으 0, 그렇지 않은 부분은 1이다.
        // 출력: 한 번에 만들 수 있는 아이스크림의 개수 출력
        String[] temp = bf.readLine().split(" ");
        row = Integer.parseInt(temp[0]);
        column = Integer.parseInt(temp[1]);
        graph = new int[row][column];
        System.out.println(row+" ,"+column);
        System.out.println("얼음판 입력이 시작됩니다. 한 줄 단위로 입력해주세요");
        for (int i=0; i<row; i++) {
            String[] temp2 = bf.readLine().split("");
            for (int j=0; j< temp2.length; j++) {
                graph[i][j] = Integer.parseInt(temp2[j]);
            }
        }
        System.out.println(Arrays.deepToString(graph));
        // 전체 아이스틀에 대해 dfs를 실시한다.
        int result = 0;
        for (int i=0; i<row; i++) {
            for (int j=0; j<column; j++) {
                if (dfs(i,j)) {
                    result++;
                }
            }
        }
        System.out.println("만들 수 있는 얼음의 수: "+result);
    }
}