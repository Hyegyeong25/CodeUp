import java.util.Scanner;

public class Ex1370 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int r = scan.nextInt();
        int cnt=0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < h*2-1; j++) {
                for (int k = 0; k < cnt; k++) {
                    System.out.print(" ");
                }
                System.out.println("*");
                if(j < h-1) cnt++; else cnt--;
            }
            cnt = 0;
        }

    }
}
