import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] k = new int[n];

        for(int i = 0; i < n; i++){
            k[i] = scan.nextInt();
        }
        for(int i = 1; i <= n; i++){
            System.out.printf("%d ", k[n-i]);
        }
    }
}
