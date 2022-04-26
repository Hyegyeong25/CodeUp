import java.util.Scanner;

public class Ex1095 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] k = new int[n];
        //min 값
        for(int i = 0; i < n; i++){
            k[i] = scan.nextInt();
        }
        int temp = k[0];
        for(int i = 0; i < k.length; i++){
            if(k[i] < temp){
                temp = k[i];
            }
        }
        System.out.println(temp);
    }
}
