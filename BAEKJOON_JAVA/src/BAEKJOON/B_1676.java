package BAEKJOON;

import java.util.Scanner;

public class B_1676 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int cnt = 0;

        for (int i = 1; i <= a; i++)
            if (i%125==0)
                cnt+=3;
            else if (i%25==0)
                cnt+=2;
            else if (i%5==0)
                cnt++;
        System.out.println(cnt);
    }
}