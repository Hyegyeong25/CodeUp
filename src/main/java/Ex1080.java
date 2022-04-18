import java.util.Scanner;

public class Ex1080 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int hap = 0;
        int result = 0;

        for(int i = 1; i <= num; i++){
            hap += i;
            if(hap >= num) {
                result = i;
                break;
            }
        }
        System.out.println(result);

    }
}
