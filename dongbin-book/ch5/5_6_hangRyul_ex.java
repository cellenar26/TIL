package com.company;

import java.util.*;

public class Main {

    public static final int INF = 111111;
    public static int[][] hangRyul = new int[][]{
            {0, 7, 5}
            , {7, 0, INF}
            , {5, INF, 0}
    };


    public static void main(String[] args) {


        System.out.println("hangRyul : "+Arrays.deepToString(hangRyul));

    }

}