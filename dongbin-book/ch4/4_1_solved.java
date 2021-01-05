package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("지도의 크기를 입력해주세요: ");
        int mapSize = sc.nextInt();
        int row = 1;
        int column = 1;
        sc.nextLine();

        System.out.print("root: ");
        String[] moveRoots = {};
        moveRoots = sc.nextLine().split("");

        for(String s : moveRoots) {
            switch (s) {
                case "U":
                    if(row-1 == 0) {
                        row = row;
                    }
                    else {
                        row = row-1;
                    }
                    break;
                case "D":
                    if(row+1 > mapSize) {
                        row = row;
                    }
                    else {
                        row = row+1;
                    }
                    break;
                case "L":
                    if(column-1 ==0) {
                        column = column;
                    }
                    else {
                        column = column-1;
                    }
                    break;
                case "R":
                    if(column+1 > mapSize) {
                        column = column;
                    }
                    else {
                        column = column+1;
                        break;
                    }
            }
        }
        System.out.print(row + " " + column);
        sc.close();
    }

}
