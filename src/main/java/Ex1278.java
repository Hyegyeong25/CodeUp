import java.util.Scanner;

public class Ex1278 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int cnt = 0;
        while (true){
            num /= 10;
            cnt++;
            if(num == 0){
                break;
            }
        }
        System.out.println(cnt);
    }
}
