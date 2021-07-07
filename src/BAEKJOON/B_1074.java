package BAEKJOON;

import java.io.*;
import java.util.StringTokenizer;

public class B_1074 {
    private static int cnt, N, r, c;
    private static int[] x = {0,0,1,1};
    private static int[] y = {0,1,0,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(stk.nextToken());
        r = Integer.parseInt(stk.nextToken());
        c = Integer.parseInt(stk.nextToken());

        int len = (int)Math.pow(2, N);
        Z(len, 0, 0);
    }

    private static void Z(int len, int row, int col) throws IOException{
        if (len == 2) {
            for (int i = 0; i < 4; i++) {
                int x2 = row + x[i];
                int y2 = col + y[i];
                if (x2 == r && y2 == c) {
                    System.out.println(cnt);
                    System.exit(0);
                }
                cnt++;
            }
            return;
        }
        Z(len/2, row, col);
        Z(len/2, row, col + len/2);
        Z(len/2, row + len/2, col);
        Z(len/2, row + len/2, col + len/2);
    }
}