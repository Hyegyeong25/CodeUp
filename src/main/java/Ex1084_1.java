import java.util.Scanner;

public class Ex1084_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int g = scan.nextInt();
        int b = scan.nextInt();
        int cnt = 0;

        int i = 0, j = 0, k = 0;

        while ( i < r ) {
            System.out.println(i + " " + j + " " + k);
            k++;
            if (k == b) {
                k = 0;
                j++;
            }
            if (j == g) {
                j = 0;
                i++;
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}
