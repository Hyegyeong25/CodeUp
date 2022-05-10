import java.io.*;
import java.util.Scanner;

public class Ex1084_2 {
    public static void main(String[] args) throws IOException {
        // 런타임 오류를 없에기 위해 Buffer를 사용하자
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        String[] str = s.split(" ");

        int r = Integer.parseInt(str[0]);
        int g = Integer.parseInt(str[1]);
        int b = Integer.parseInt(str[2]);

        for(int i = 0; i < r; i++){
            for(int j = 0; j < g; j++){
                for(int k = 0; k < b; k++){
                    bw.write(i+" "+j+" "+k+"\n");
                }
            }
        }
        int num = r*g*b;
        bw.write(num+"");
        bw.flush();
        br.close();
        bw.close();
    }
}
