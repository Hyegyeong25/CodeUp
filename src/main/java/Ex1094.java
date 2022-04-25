import java.util.Scanner;

public class Ex1094 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); //번호를 부른 횟수
        int[] k = new int[n]; //n개의 번호가 담길 배열

        for(int i = 0; i < n; i++){
            k[i] = scan.nextInt();
        }
        for(int i = 1; i <= n; i++){
            System.out.printf("%d ", k[n-i]);
        }
    }
}
