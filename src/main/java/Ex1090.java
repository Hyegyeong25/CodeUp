import java.util.Scanner;

public class Ex1090 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int r = scan.nextInt();
        int n = scan.nextInt();
        long result = a;
        for(int i = 1; i < n; i++){
            result *= r;
        }
        System.out.println(result);
    }
}
