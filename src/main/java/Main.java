import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        int i = 0;
        while(true){
            i++;
            sum += i;
            if(sum >= num) {
                break;
            }
        }
        System.out.println(sum);
    }
}
