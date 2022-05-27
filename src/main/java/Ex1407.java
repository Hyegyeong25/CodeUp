import java.util.Scanner;

public class Ex1407 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String noEmpty = str.replaceAll(" ", "");
        System.out.println(noEmpty);
    }
}
