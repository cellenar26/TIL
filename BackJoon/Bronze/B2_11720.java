import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    // b2_11720
    public static void main(String[] args) throws IOException{
        // N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
        // 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
        // 입력으로 주어진 숫자 N개의 합을 출력한다.
        // 숫자의 범위에 주의 할 것
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        String[] test = bf.readLine().toString().split("");
//        System.out.println(Arrays.toString(test));

        Long result = 0L;

        for (int i = 0; i < N; i++) {
            result += Integer.parseInt(test[i]);
        }
        System.out.println(result);
    }
}