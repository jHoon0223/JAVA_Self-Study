package BAEKJOON;

import java.io.*;

public class B_1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split( " ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        br.close();
        int num = 1, cnt = 1, result = 0;

        int[] array = new int[b];
        for (int i = 0; i < b; i++) {
            if (cnt-- > 0)
                array[i] = num;
            else {
                num++;
                array[i] = num;
                cnt = num-1;
            }
        }
        for (int i = a-1; i < b; i++)
            result += array[i];
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.append(result + "");
        bw.flush();
        bw.close();
    }
}
