package com.company;

import java.awt.desktop.SystemSleepEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    // b5_11654
    public static void main(String[] args) throws Exception{

        // 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
        // 알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.
        // 입력으로 주어진 글자의 아스키 코드 값을 출력한다.
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char t = bf.readLine().charAt(0);
        int target = (int) t;
//        System.out.println(t);
//        System.out.println((int)t);
        System.out.println(target);
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
