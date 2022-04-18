package Exam0418;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num % 2 == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }
    }
}
