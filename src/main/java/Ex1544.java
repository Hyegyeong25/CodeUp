import java.util.Scanner;

public class Ex1544 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        star(n);
    }
    static void star(int n){
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
}
