package BAEKJOON;

import java.io.*;
import java.util.Arrays;

public class B_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] array = new int[N];
        //int[] counting = new int[N+1];
        int[] result = new int[N];

        for (int i = 0; i < N; i++)
            array[i] = Integer.parseInt(br.readLine());

        /*for (int i = 0; i < N; i++)
            counting[array[i]]++;
        for (int i = 2; i < N+1; i++)
            counting[i] += counting[i-1];
        for (int i = N-1; i >= 0; i--)
            result[--counting[array[i]]] = array[i];*/

        Arrays.sort(array);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        /*for (int a : result) {
            if (a != 0) {
                bw.append(a+"\n");
            }
        }*/
        for (int i = 0; i < N; i++)
            bw.append(array[i]+"\n");
        bw.flush();
        br.close();
        bw.close();
    }
}