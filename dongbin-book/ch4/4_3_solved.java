package com.company;

import java.util.*;

public class Main {

    public static int[][] maps = new int[50][50];
    public static int[][] visits = new int[50][50];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("맵을 생성해주세요(row, column): ");
        String[] rowNColumns = sc.nextLine().split(" ");
        int mapRow = Integer.parseInt(rowNColumns[0]);
        int mapColumn = Integer.parseInt(rowNColumns[1]);

        System.out.print("북쪽에서 떨어진 방향, 서쪽에서 떨어진 방향, 캐릭터가 현재 보는 방향을 입력하세요 : ");
        String[] nowWhere = sc.nextLine().split(" ");
        int nowRow = Integer.parseInt(nowWhere[0]);
        int nowColumn = Integer.parseInt(nowWhere[1]);
        int nowDirection = Integer.parseInt(nowWhere[2]);

        System.out.println("육지/바다를 입력하세요. 육지는0, 바다는1");
        //sc.nextLine();

        for(int i=0; i<mapRow; i++) {
            for(int j=0; j<mapColumn; j++) {
                maps[i][j] = sc.nextInt();
                visits[i][j] = 0;
            }
        }
        visits[nowRow][nowColumn] = 1;

        int countVisit = 1;
        int countTurn = 0;
        int[] dx = {-1, 0, 1, 0}; // 북, 남
        int[] dy = {0, 1, 0, -1}; // 동, 서

        boolean isNotDone = true;

        while(isNotDone) {
            // 왼쪽으로 회전을 먼저 한다.
            if(nowDirection == 0) {
                nowDirection = 3;
            }
            else {
                nowDirection--;
            }

            // 현재 위치 기준에서 왼쪽으로 회전된 상태이므로, 임시 row와 column에 이를 반영해야 한다.
            // temp 값은 누적되면 안되므로 늘 초기화를 시킨다.

            int tempRow = 0;
            int tempColumn = 0;
            tempRow += nowRow + dx[nowDirection];
            tempColumn += nowColumn + dy[nowDirection];
            //System.out.println("tempRow: "+tempRow+" // tempColumn: "+tempColumn + " // count : "+countVisit);
            if(maps[tempRow][tempColumn] == 0 && visits[tempRow][tempColumn] == 0) {
                System.out.println("if here !!! tempRow: "+tempRow+" // tempColumn: "+tempColumn);
                visits[tempRow][tempColumn] = 1;
                nowRow = tempRow;
                nowColumn = tempColumn;
                countVisit++;
                countTurn = 0;
                continue;
            }
            else { // 회전한 이후, 정면에 가보지 않은 칸이 없거나 바다인 경우
                countTurn++;
            }

            // 4 방향 모두 갈 수 없는 경우
            if (countTurn == 4) {
                tempRow = nowRow - dx[nowDirection];
                tempColumn = nowColumn - dy[nowDirection];
                if (maps[tempRow][tempColumn] == 0) { // 뒤로 갈 수 있다면
                    nowRow = tempRow;
                    nowColumn = tempColumn;
                }
                else { // 뒤가 바다로 막힌 경우
                    break;
                }
                countTurn = 0;
            }
        }


        System.out.println("answer : "+countVisit);
        sc.close();
    }

}