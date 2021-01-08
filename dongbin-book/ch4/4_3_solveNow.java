package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("맵을 생성해주세요(row, column): ");
        String[] rowNColumns = sc.nextLine().split(" ");
        int mapRow = Integer.parseInt(rowNColumns[0]);
        int mapColumn = Integer.parseInt(rowNColumns[1]);
        System.out.println(Arrays.deepToString(rowNColumns));

        System.out.print("좌표, 바라보고 있는 방향을 입력해주세요(row, column, direction): ");
        String[] nowLocations = sc.nextLine().split(" ");
        int nowRow = Integer.parseInt(nowLocations[0]);
        int nowColumn = Integer.parseInt(nowLocations[1]);
        int nowDir = Integer.parseInt(nowLocations[2]);
        int countVisit = 1;
        int countTurn = 0;

        int[][] maps = new int[mapRow][mapColumn];
        int[][] visitedLoc = new int[mapRow][mapColumn];
        int[] dRow = {-1, 0, 1, 0}; // 북쪽과 남쪽의 이동에만 관여
        int[] dColumn = {0, 1, 0, -1}; // 동쪽과 서쪽의 이동에만 관여

        System.out.println("육지/바다를 생성해주세요: ");
        for(int i=0; i<mapRow; i++) {
            for(int j=0; j<mapColumn; j++) {
                maps[i][j]  = sc.nextInt();
                visitedLoc[i][j] = 0;
            }
        }

        visitedLoc[nowRow][nowColumn] = 1;
        int tempRow = 0;
        int tempColumn = 0;

        while(true) {
            // 왼쪽방향으로 90도 회전을 한다.
            if(nowDir == 0) {
                nowDir = 3;
            }
            else {
                nowDir -= 1;
            }

            tempRow = nowRow + dRow[nowDir];
            tempColumn = nowColumn + dColumn[nowDir];
            if(maps[tempRow][tempColumn] == 0 && visitedLoc[tempRow][tempColumn] == 0) {
                visitedLoc[tempRow][tempColumn] = 1;
                nowRow = tempRow;
                nowColumn = tempColumn;
                countVisit += 1;
                countTurn = 0;
                continue;
            }
            else {
                countTurn += 1;
            }

            if (countTurn == 4) {
                tempRow = nowRow - dRow[nowDir];
                tempColumn = nowColumn - dColumn[nowDir];
                if (maps[tempRow][tempColumn] == 0) {
                    nowRow = tempRow;
                    nowColumn = tempColumn;
                }
                else {
                    break;
                }
                countTurn = 0;
            }


            break;
        }

        System.out.println("answer : "+countVisit);
        sc.close();
    }

}
