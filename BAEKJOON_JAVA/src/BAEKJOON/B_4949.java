package BAEKJOON;

import java.util.Scanner;
import java.util.Stack;

public class B_4949 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Stack<Character> stack = new Stack<>();
            String s = scanner.nextLine();

            if (s.equals("."))
                break;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '(' || s.charAt(j) == '[')
                    stack.push(s.charAt(j));
                else if (s.charAt(j) == ')' && !stack.empty() && stack.peek() == '(')
                    stack.pop();
                else if (s.charAt(j) == ']' && !stack.empty() && stack.peek() == '[')
                    stack.pop();
                else if (s.charAt(j) == ')' || s.charAt(j) == ']')
                    stack.push(s.charAt(j));
                else
                    continue;
            }

            if (stack.empty())
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}
