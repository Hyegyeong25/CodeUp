import java.util.Scanner;

public class Ex1411_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int hap=0;

        for (int i = 1; i <= n; i++) {
            hap += i;
        }
        for (int i = 1; i < n; i++) {
            int a = s.nextInt();
            hap -= a;
        }
        System.out.println(hap);
    }
}
