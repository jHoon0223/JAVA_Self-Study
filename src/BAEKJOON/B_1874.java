package BAEKJOON;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class B_1874 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        ArrayList<Character> total = new ArrayList<>();
        int n = scanner.nextInt();
        int a = 0, j = 0, k = 1;
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        while(true) {
            if (!stack.empty() && array[j] < stack.peek()) {
                System.out.println("NO");
                return ;
            }

            if (j >= n && stack.empty())
                break;

            if (!stack.empty() && stack.peek() == array[j]) {
                stack.pop();
                total.add('-');
                j++;
                continue;
            }

            stack.push(k);
            total.add('+');
            k++;
        }

        for (int i = 0; i < total.size(); i++) {
            System.out.println(total.get(i));
        }
    }
}
