import java.util.Scanner;

public class Ex1072 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();
        int[] arrNum = new int[cnt];
        for(int i = 0; i < cnt; i++){
            arrNum[i] = scan.nextInt();
        }
        for(int i = 0; i < cnt; i++){
            System.out.println(arrNum[i]);
        }
    }
}
