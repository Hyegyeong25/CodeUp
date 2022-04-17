import java.util.Scanner;

public class Ex1075 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int i = num;
        while(i > 0){
            --i;
            System.out.println(i);
        }
    }
}
