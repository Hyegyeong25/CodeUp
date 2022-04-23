package Exam0419;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        //1. 3 또는 5의 배수일때만 더하기
        //2. while 구구단, 3단과 5단일때만 <i단> 출력
        //3. 홀짝구분해서 더하기 또는 곱하기

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        for(int i = 1; i <= num; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
