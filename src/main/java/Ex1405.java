import java.util.Scanner;

public class Ex1405 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] nArr = new int[num];
        for(int i = 0; i < num; i++){
            nArr[i] = scan.nextInt();
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                int sum = i+j;
                if (sum >= num) {
                    sum -= num;
                }
                System.out.print(nArr[sum]+" ");
            }
            System.out.println();
        }
    }
}
