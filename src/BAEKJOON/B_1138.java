package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1138 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");

        int[] result = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            index = Integer.parseInt(stk.nextToken());
            for (int j = 0; j < n; j++) {
                if (index == 0 && result[j] == 0) {
                    result[j] = i+1;
                    break;
                }
                else if (result[j] == 0){
                    index--;
                }
            }
        }
        for (int i : result)
            System.out.print(i + " ");
    }
}