package BAEKJOON;

import java.io.*;

public class B_1748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        br.close();

        int n = str.length(), m = n-1, total = 0;

        if (Integer.parseInt(str) < 10) {
            System.out.println(str);
        }
        else {
            for (int i = 0; i < m; i++) {
                total += (9 * (Math.pow(10, i)) * (i+1));
            }
            total += ((Integer.parseInt(str)-(Math.pow(10, m)))+1) * n;

            System.out.println(total);
        }
    }
}
