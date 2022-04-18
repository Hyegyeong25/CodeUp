import java.util.Scanner;

public class Ex1081 {
    public static void main(String[] args) {
        /*
        * 주사위 2개의 면의 개수 n, m이 공백을 두고 입력된다.
          단, n, m은 10이하의 자연수
        * */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                System.out.println(i + " " + j);
            }
        }

    }
}
