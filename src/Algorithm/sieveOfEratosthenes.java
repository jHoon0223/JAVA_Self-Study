package Algorithm;

import java.io.*;
import java.util.ArrayList;

public class sieveOfEratosthenes {
    //public static final int MAX = 25;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int MAX = Integer.parseInt(br.readLine());
        br.close();

        ArrayList<Integer> primeList = new ArrayList<Integer>();
        boolean isPrime[] = new boolean[MAX+1];

        for (int i = 2; i <= MAX; i++)
            isPrime[i] = true;

        for (int i = 2; i <= MAX; i++) {
            if(!isPrime[i])
                continue;
            else
                primeList.add(i);
            for (int j = i*2; j <= MAX; j += i)
                isPrime[j] = false;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < primeList.size(); i++)
            bw.append(primeList.get(i) + " ");
        bw.flush();
        bw.close();
    }
}
