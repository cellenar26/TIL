package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    public static int row;
    public static int col;
    public static int[][] graph;

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("row : ");
        row = Integer.parseInt(bf.readLine());
        System.out.print("col : ");
        col = Integer.parseInt(bf.readLine());
        System.out.print(row+", "+col);

        graph = new int[row][col];
        System.out.println("");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j<col; j++) {
                System.out.print("요소 입력 : ");
                graph[i][j] = Integer.parseInt(bf.readLine());
            }
        }
        System.out.println(Arrays.deepToString(graph));
    }
}