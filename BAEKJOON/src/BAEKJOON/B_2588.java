package BAEKJOON;

import java.util.Scanner;

public class B_2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a * (b%10));
        System.out.println(a * (((b%100)-b%10)/10));
        System.out.println(a * ((b-(b%100))/100));
        System.out.println(a * b);
    }
}
