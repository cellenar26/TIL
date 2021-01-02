package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] numbers = {};
        int row, column;
        System.out.println("행열입력시작");
        row = sc.nextInt();
        column = sc.nextInt();

        numbers = new int[row][column];
        System.out.println("배열입력시작");
        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        int minValue=0;

        for(int i=row-1; i<row; i++) {
            for(int j=0; j<column-1; j++) {
                minValue = numbers[i][j];
                if(minValue > numbers[i][j+1]) {
                    minValue = numbers[i][j+1];
                }
            }
        }
        System.out.printf("가장 숫자가 낮은 수: %d", minValue);


    }

}
