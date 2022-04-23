import java.util.Scanner;

public class Ex1092 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int i = 1;
        while(true) {
            if((i % a == 0)&&(i % b == 0)&&(i % c == 0)){
                break;
            } else {
                i++;
            }
        }
        System.out.println(i);

    }
}
