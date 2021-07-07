package BAEKJOON;

import java.io.*;
import java.util.StringTokenizer;

public class B_1629 {
    private static int A, B, C;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
        A = Integer.parseInt(stk.nextToken());
        B = Integer.parseInt(stk.nextToken());
        C = Integer.parseInt(stk.nextToken());
        br.close();

        long total = pow(A, B);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.append(total+"");
        bw.flush();
        bw.close();
    }
    private static long pow(long a, long b) {
        if (b == 1)
            return a % C;
        long temp = pow(a, b/2);
        if (b % 2 == 1)
            return (temp * temp % C) * a % C;
        return temp * temp % C;
    }
}