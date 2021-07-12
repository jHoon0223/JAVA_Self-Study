package BAEKJOON;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class B_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        /*int[] array = new int[N];
        for (int i = 0; i < N; i++)
            array[i] = Integer.parseInt(br.readLine());*/

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++)
            list.add(Integer.parseInt(br.readLine()));

        Collections.sort(list);

        //Arrays.sort(array);

        StringBuilder sb = new StringBuilder();
        for (int a : list)
            sb.append(a).append("\n");
        System.out.print(sb);
    }
}