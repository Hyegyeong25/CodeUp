import java.util.Scanner;

public class Ex1089 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int d = scan.nextInt();
        int n = scan.nextInt();
        long result = a;
        for(int i = 1; i < n; i++){
            result += d;
        }
        System.out.println(result);

    }
}
