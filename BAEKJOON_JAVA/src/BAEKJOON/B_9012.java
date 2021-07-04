package BAEKJOON;

import java.util.Scanner;
import java.util.Stack;

public class B_9012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("개수 입력 >> ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int cntA = 0;
            int cntB = 0;

            Stack<Character> stack = new Stack<>();
            System.out.print("문자열 입력 >> ");
            String s = scanner.next();

            for (int j = 0; j < s.length(); j++) {

                if (s.charAt(j) == '(') {
                    stack.push(s.charAt(j));
                    cntA++;
                }
                else if (s.charAt(j) == ')' && stack.empty()) {
                    cntB++;
                }
                else {
                    cntB++;
                    stack.pop();
                }
            }

            if (stack.empty() && cntA==cntB)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
