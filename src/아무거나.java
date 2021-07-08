import java.io.*;
import java.util.StringTokenizer;

public class 아무거나 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);*/
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(stk.nextToken());
        int b = Integer.parseInt(stk.nextToken());
        br.close();

        //System.out.println(a + "," + b);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.append(a + "," + b);
        bw.flush();
        bw.close();
    }
}
