import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;

        String s = Long.toString(n);

        char[] temp = s.toCharArray();

        for (int i = 0; i < temp.length-1; i++) {
            for (int j = i + 1; j < temp.length; j++) {
                if (temp[i] < temp[j]) {
                    char t = temp[j];
                    temp[j] = temp[i];
                    temp[i] = t;
                }

            }
        }
//        System.out.println(Arrays.toString(temp));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < temp.length; i++) {
            sb.append(temp[i]);
        }
//        System.out.println(sb.toString());
        String aa = sb.toString();
        answer = Long.parseLong(sb.toString());
        return answer;
    }
}