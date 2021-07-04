package BAEKJOON;

import java.util.*;
import java.io.*;

public class B_17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] array = new int[n];
        int[] result = new int[n];

        String[] str = br.readLine().split( " ");
        for (int i = 0; i < n; i++)
            array[i] = Integer.parseInt(str[i]);

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int i = 1; i < n; i++) {
            if (stack.isEmpty())
                stack.push(i);
            while (!stack.isEmpty() && array[stack.peek()] < array[i]) {
                result[stack.pop()] = array[i];
            }
            stack.push(i);
        }

        while (!stack.empty()) {
            result[stack.pop()] = -1;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int a = 0; a < n; a++)
            bw.write(result[a] + " ");

        bw.write("\n");
        bw.flush();
    }
}
