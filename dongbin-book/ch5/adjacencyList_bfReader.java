package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    public static int row;
    public static int col;
    public static ArrayList<Integer>[] graph;

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        row = Integer.parseInt(bf.readLine());
        col = Integer.parseInt(bf.readLine());
        graph = (ArrayList<Integer>[]) new ArrayList[row+1];

        for (int i=1; i<=row; i++) {
            graph[i] = new ArrayList<>();
        }


        for (int i=0; i<col; i++) {
            int now = Integer.parseInt(bf.readLine());
            int foward = Integer.parseInt(bf.readLine());
            graph[now].add(foward);
            graph[foward].add(now);
        }
        System.out.println(Arrays.deepToString(graph));
    }
}