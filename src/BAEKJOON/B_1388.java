package BAEKJOON;

import java.io.*;

public class B_1388 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        char[][] tile = new char[N][M];
        for (int i = 0; i < N; i++)
            tile[i] = br.readLine().toCharArray();

        int cntH = 0, cntV = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (tile[i][j] == '-') {
                    cntH++;
                    while(true) {
                        if (j < M && tile[i][j] == '-')
                            j++;
                        else
                            break;
                    }
                }
            }
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (tile[j][i] == '|') {
                    cntV++;
                    while(true) {
                        if (j < N && tile[j][i] == '|')
                            j++;
                        else
                            break;
                    }
                }
            }
        }
        int total = cntH + cntV;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.append(total + "");
        bw.flush();
        bw.close();
    }
}