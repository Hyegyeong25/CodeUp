import java.util.Locale;
import java.util.Scanner;

public class Ex1414 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.toLowerCase(); //전부 소문자
        //c개수 찾기
        int c = 0;
        //cc개수 찾기
        int cc = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'c') c++;
            if (i < s.length()-1 && s.charAt(i) == 'c' && s.charAt(i+1) == 'c') cc++;
        }

        System.out.println(c);
        System.out.println(cc);
    }
}
