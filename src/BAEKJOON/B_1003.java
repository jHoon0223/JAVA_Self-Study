package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        while (n-->0) {
            StringBuilder sb = new StringBuilder();
            int a = Integer.parseInt(br.readLine());

            int cnt0 = 1;
            int cnt1 = 0;
            int add = 1;

            for (int i = 0; i < a; i++) {
                cnt0 = cnt1;
                cnt1 = add;
                add = cnt0 + cnt1;
            }
            sb.append(cnt0);
            sb.append(' ');
            sb.append(cnt1);
            System.out.println(sb.toString());
        }
    }
}
