package BAEKJOON;

import java.io.*;

public class B_1105 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int L = Integer.parseInt(str[0]);
        int R = Integer.parseInt(str[1]);
        br.close();
        int cnt = 0;

        while(R != 0) {
            if (L%10 == R%10) {
                if (L%10 == 8)
                    cnt++;
            }
            else
                cnt = 0;
            L/=10;
            R/=10;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.append(cnt + "");
        bw.flush();
        bw.close();
    }
}
