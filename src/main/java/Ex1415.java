import java.util.Scanner;

public class Ex1415 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[10];
        int odd=0, even=0;
        for (int i = 0; i < num.length; i++) {
            num[i] = scan.nextInt();
            //입력받은 수의 홀짝 구분
            if(num[i] % 2 == 0) {
                //짝
                if(num[i]>even){
                    even = num[i];
                }
            } else {
                //홀
                if(num[i]>odd){
                    odd = num[i];
                }
            }
        }
        if(odd > 0) System.out.print(odd+" ");
        if(even > 0) System.out.print(even);
    }
}
