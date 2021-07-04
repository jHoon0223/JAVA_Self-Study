package BAEKJOON;

import java.util.Scanner;

public class B_2609 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 0, n = 1;

        while(true) {
            if (a%n==0 && b%n==0)
                c = n;
            n++;

            if (n > (a>b ? b : a))
                break;
        }
        System.out.println(c);

        int m = 1;
        if (c != 0) {
            m *= c;
            m *= a/c;
            m *= b/c;
        }
        System.out.println(m);
    }
}
