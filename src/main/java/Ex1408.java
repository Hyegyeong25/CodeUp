import java.util.Scanner;

public class Ex1408 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String pw[] = new String[2];
        pw[0] = "";
        pw[1] = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            pw[0] = pw[0]+(char)(ch+2);
            pw[1] = pw[1]+(char)((ch*7)%80+48);
        }
        System.out.println(pw[0]);
        System.out.println(pw[1]);
    }
}
