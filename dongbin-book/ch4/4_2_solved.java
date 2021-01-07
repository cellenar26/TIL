package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("좌표를 입력하세요");
        String[] rowNColumn = sc.nextLine().split("");

        int nowRow = Integer.parseInt(rowNColumn[1]);
        int nowColumn = 0;
        int count = 0;

        switch (rowNColumn[0]) {
            case "a":
                nowColumn = 1;
                break;
            case "b":
                nowColumn = 2;
                break;
            case "c":
                nowColumn = 3;
                break;
            case "d":
                nowColumn = 4;
                break;
            case "e":
                nowColumn = 5;
                break;
            case "f":
                nowColumn = 6;
                break;
            case "g":
                nowColumn = 7;
                break;
            case "h":
                nowColumn = 8;
                break;
            default:
                break;
        }

        if(nowColumn+2 <= 8 && nowRow-1 >= 1) {
            System.out.println("1번가정!");
            count++;
        }

        if(nowColumn+2 <= 8 && nowRow+1 <= 8) {
            System.out.println("2번가정!");
            count++;
        }

        if(nowColumn-2 >= 1 && nowRow-1 >= 1) {
            System.out.println("3번가정!");
            count++;
        }

        if(nowColumn-2 >= 1 && nowRow+1 <= 8) {
            System.out.println("4번가정!");
            count++;
        }

        if(nowRow+2 <=8 && nowColumn+1 <=8) {
            System.out.println("5번가정!");
            count++;
        }

        if(nowRow+2 <=8 && nowColumn-1 >= 1) {
            System.out.println("6번가정!");
            count++;
        }

        if(nowRow-2 >= 1 && nowColumn-1 >= 1) {
            System.out.println("7번가정!");
            count++;
        }

        if(nowRow-2 >= 1 && nowColumn+1 <=8) {
            System.out.println("8번가정!");
            count++;
        }

        //System.out.println("row: "+rowNColumn[1]+"  column :"+rowNColumn[0]);
        System.out.println("moves: "+count);
        sc.close();
    }

}
