import java.util.Scanner;

public class Ex1409 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num[] = new int[10];
        for(int i=0;i<num.length;i++){
            num[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        System.out.println(num[k-1]);
    }
}
