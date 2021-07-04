package BAEKJOON;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class B_5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        while(n-->0) {
            List<Character> list = new LinkedList<>();
            String str = br.readLine();
            int index = 0;
            for (int i = 0; i < str.length(); i++) {
                switch(str.charAt(i)) {
                    case '<':
                        if (index == 0)
                            break;
                        index--;
                        break;
                    case '>':
                        if (index == list.size())
                            break;
                        index++;
                        break;
                    case '-':
                        if (index == 0)
                            break;
                        list.remove(index-1);
                        index--;
                        break;
                    default:
                        list.add(index, str.charAt(i));
                        index++;
                        break;
                }
            }
            /*BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            for (char a : list)
                bw.append(a);
            bw.flush();
            System.out.println();*/
            StringBuilder sb = new StringBuilder();
            for (char a : list)
                sb.append(a);
            System.out.println(sb.toString());
        }
    }
}
