package com.company;

import java.awt.desktop.SystemSleepEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    // b1_2750
    public static void main(String[] args) throws IOException {

        // 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다.
        // 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
        // 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
        }

        for (int i = 0; i < N-1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
    }
}
//class Solution {
//    public int removeDuplicates(int[] nums) {
//        int index = 1;
//
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i] != nums[i + 1]) {
//                nums[index] = nums[i + 1];
//                index++;
//            }
//        }
//
//        return index;
//    }
//}
