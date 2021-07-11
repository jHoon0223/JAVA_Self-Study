package BAEKJOON;

public class B_15596 {
    long sum(int[] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++)
            result += a[i];
        return result;
    }
}
