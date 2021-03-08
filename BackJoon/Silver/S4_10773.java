package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    // s4_10773

    public static void main(String[] args) throws IOException{
        // 첫 번째 줄에 정수 K가 주어진다. (1 ≤ K ≤ 100,000)
        //이후 K개의 줄에 정수가 1개씩 주어진다. 정수는 0에서 1,000,000 사이의 값을 가지며,
        // 정수가 "0" 일 경우에는 가장 최근에 쓴 수를 지우고, 아닐 경우 해당 수를 쓴다.
        //정수가 "0"일 경우에 지울 수 있는 수가 있음을 보장할 수 있다.

        // 재민이가 최종적으로 적어 낸 수의 합을 출력한다. 최종적으로 적어낸 수의 합은 231-1보다 작거나 같은 정수이다.
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(bf.readLine());
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < K; i++) {
            StringTokenizer stk = new StringTokenizer(bf.readLine());
            int now = Integer.parseInt(stk.nextToken());

            if (now == 0) {
                st.pop();
            }
            else if (now != 0){
                st.add(now);
            }

        }
//        System.out.println(st.isEmpty());
        int result = 0;
        if (st.isEmpty() == true) {
            System.out.println(result);
        }
        else {
            while (st.isEmpty() == false) { // 비어있지 않는 동안 계속 더함
                result += st.pop();
            }
            System.out.println(result);
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
