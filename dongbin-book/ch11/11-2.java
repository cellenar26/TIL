package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        // 0~9 로 이뤄진 문자열이 입력된다. (1<= n <= 20)
        // 왼쪽부터 연산
        // 곱 or 덧셈만으로 가장 큰수를 만든다.

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = bf.readLine().split("");

        int result = 0;

        if (numbers.length == 1) {
            int number = Integer.parseInt(numbers[0]);
            System.out.println(number);
            return;
        }
        else if (numbers.length == 2) {
            int first = Integer.parseInt(numbers[0]);
            int second = Integer.parseInt(numbers[1]);
            if (first == 0 || second ==0) {
                result = first + second;
                System.out.println(result);
                return;
            }
        }
        else { // 숫자가 3자리 이상일 때
            int first = Integer.parseInt(numbers[0]);
            int second = Integer.parseInt(numbers[1]);
            if (first == 0 || second == 0) {
                result = first + second;
            }
            else {
                result = first * second;
            }

            for (int i=2; i< numbers.length; i++) {
                int temp = Integer.parseInt(numbers[i]);
                if (temp == 0) {
                    result = result + temp;
                }
                else {
                    result = result * temp;
                }
            }
            System.out.println(result);
            return;
        }
    }
}