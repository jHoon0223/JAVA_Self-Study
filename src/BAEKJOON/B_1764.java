package BAEKJOON;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class B_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());

        ArrayList<String> list = new ArrayList<>();
        while(N-->0) {
            String s = br.readLine();
            list.add(s);
        }
        Collections.sort(list);
        String[] hear = new String[list.size()];
        hear = list.toArray(hear);

        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String see = br.readLine();
            int idx = Arrays.binarySearch(hear, see);
            if (idx >= 0)
                result.add(see);
        }
        Collections.sort(result);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.append(result.size()+"\n");
        bw.flush();
        for (String s : result)
            System.out.println(s);
        br.close();
        bw.close();
    }
}