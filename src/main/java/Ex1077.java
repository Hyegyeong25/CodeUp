import java.util.Scanner;

public class Ex1077 {
    public static void main(String[] args) {
        // scanner 함수를 이용해 int num에 값 입력 받음
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        // 0부터 num까지 출력하기 위한 반복문
        for(int i = 0; i <= num; i++) {
            System.out.println(i);
        }

    }
}
