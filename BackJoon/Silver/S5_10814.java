package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    // s5_10814

    public static class People implements Comparable<People>{
        private int age;
        private String name;
        private int registerIndex;

        public People(int age, String name, int registerIndex) {
            this.age = age;
            this.name = name;
            this.registerIndex = registerIndex;
        }

        @Override
        public int compareTo(People o) {
            return this.age - o.age; // 이 순서를 바꾸면 틀림
        }
    }

    public static void main(String[] args) throws IOException{
        // 첫째 줄에 온라인 저지 회원의 수 N이 주어진다. (1 ≤ N ≤ 100,000)
        //
        //둘째 줄부터 N개의 줄에는 각 회원의 나이와 이름이 공백으로 구분되어 주어진다.
        // 나이는 1보다 크거나 같으며, 200보다 작거나 같은 정수이고, 이름은 알파벳 대소문자로 이루어져 있고, 길이가 100보다 작거나 같은 문자열이다.
        // 입력은 가입한 순서로 주어진다.

        // 첫째 줄부터 총 N개의 줄에 걸쳐 온라인 저지 회원을 나이 순, 나이가 같으면 가입한 순으로 한 줄에 한 명씩 나이와 이름을 공백으로 구분해 출력한다.
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        People[] parr = new People[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int nowIndex = i;
            int nowAge = Integer.parseInt(st.nextToken());
            String nowName = st.nextToken();

            People p = new People(nowAge, nowName, nowIndex);
            parr[i] = p;
        }
        // Arrays.sort(parr); // 해제시 에러 남
        Arrays.sort(parr);
//        System.out.println("정렬 후 ");

        for (int i = 0; i < N; i++) {
            System.out.print(parr[i].age + " "+ parr[i].name);
            System.out.println("");
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
