package Exam0419;

import java.util.Scanner;

public class StarTest02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                int dec = num - 1 - i;
                if(j < dec) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
