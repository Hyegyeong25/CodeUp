import java.util.Scanner;

public class Ex1076 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);

        for(int i = 97; i < (int)ch+1; i++) {
            System.out.printf("%c ", i);
        }
    }
}
