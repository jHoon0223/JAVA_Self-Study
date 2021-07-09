package BAEKJOON;

import java.io.*;
import java.util.StringTokenizer;

public class B_1357 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
        int X = Integer.parseInt(stk.nextToken());
        int Y = Integer.parseInt(stk.nextToken());
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int total = F(F(X) + F(Y));
        bw.append(total+"");
        bw.flush();
        bw.close();
    }

    private static int F(int n) {
        if (n/1000 != 0) {
            return (n%10)*1000 + (n%100/10)*100 + (n%1000/100)*10 + (n/1000);
        }
        else if (n/100 != 0) {
            return (n%10)*100 + (n%100/10)*10 + (n/100);
        }
        else if (n/10 != 0) {
            return (n%10)*10 + (n/10);
        }
        else
            return n;
    }
}