package BAEKJOON;

import java.io.*;

public class B_1417 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];
        for (int i = 0; i < N; i++)
            array[i] = Integer.parseInt(br.readLine());
        br.close();

        int cnt = 0, max, maxIndex = 0;
        while (true) {
            max = 0;
            for (int i = 0; i < N; i++) {
                if (max <= array[i]) {
                    max = array[i];
                    maxIndex = i;
                }
            }
            if (maxIndex == 0)
                break;
            array[maxIndex]--;
            array[0]++;
            cnt++;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.append(cnt+"");
        bw.flush();
        bw.close();
    }
}