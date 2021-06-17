package BAEKJOON;

import java.util.Scanner;
import java.util.Stack;

public class B_10773 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        int k = scanner.nextInt();
        int total = 0;

        for (int i = 0; i < k; i++) {
            int a = scanner.nextInt();

            if (a == 0)
                stack.pop();
            else
                stack.push(a);
        }

        while(!stack.empty()) {
            total += stack.pop();
        }

        System.out.println(total);
    }
}
