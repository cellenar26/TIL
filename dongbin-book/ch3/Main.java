package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // 거스름돈으로 사용하는 500원, 100원 50원, 10원짜리 동전은 무한하다.
        // 거스름돈 대상은 항상 10의 배수이다.
        // 이 때 거슬러줘야 할 동전의 최소 개수를 구하라.
        System.out.println("거슬러줘야할 돈을 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        int exchange = sc.nextInt();

        // 500원으로 거스를 때 최대 동전 수
        int afterFiveHund = fiveHund(exchange);
        exchange = exchange - afterFiveHund*500;

        // 100원으로 거스를 때 최대 동전 수
        int afterOneHund = oneHund(exchange);
        exchange = exchange - afterOneHund*100;

        // 50원으로 거스를 때 최대 동전 수
        int afterFiveTen = fiveTen(exchange);
        exchange = exchange - afterFiveTen*50;

        // 10원으로 거스를 때 최대 동전 수
        int afterTen = tenTen(exchange);
        System.out.printf("%d %d %d %d",afterFiveHund, afterOneHund, afterFiveTen, afterTen);

    }

        public static int fiveHund(int money) {
            int exchangeCoins = money / 500;
            return exchangeCoins;
        }

        public static int oneHund(int money) {
            int exchangeCoins = money / 100;
            return exchangeCoins;
        }

        public static int fiveTen(int money) {
            int exchangeCoins = money / 50;
            return exchangeCoins;
        }

        public static int tenTen(int moeny) {
            int exchangeCoins = moeny / 10;
            return exchangeCoins;
        }
}
