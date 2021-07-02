import java.io.*;
import java.nio.Buffer;

public class 아무거나 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        br.close();

        System.out.println(a + "," + b);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.append(a + "," + b);
        bw.flush();
        bw.close();
    }
}
