import java.util.Scanner;

public class Ex1078 {
    public static void main(String[] args) {
        //1부터 입력된 수까지 짝수의 합을 출력한다.
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int hap = 0;
        //1부터 num까지 돌려서 짝수일때만 합침
        for(int i = 1; i < num + 1; i++) {
            if(i % 2 == 0) hap += i;
        }
        System.out.println(hap);
    }
}
