package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("1로 향하게 할 숫자를 입력해주세요: ");
        int goToOne = sc.nextInt();
        System.out.print("나눗셈을 할 숫자를 입력해주세요: ");
        int divideNumber = sc.nextInt();

        boolean notDone = true;
        int count = 0;

        while(notDone) {
            if(goToOne % divideNumber == 0) {
                goToOne = goToOne / divideNumber;
                count++;
            }
            else {
                goToOne--;
                count++;
            }

            if(goToOne == 1) {
                notDone = false;
            }
        }

        System.out.printf("연산 횟수 : %d", count);
    }

}
