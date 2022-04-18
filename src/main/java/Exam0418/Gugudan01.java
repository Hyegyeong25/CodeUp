package Exam0418;

public class Gugudan01 {
    public static void main(String[] args) {
        int i = 2;
        int j = 1;
        while(i < 10) {
            if(((i == 4) || (i == 7)) && j == 1 ){
                System.out.println("["+i+"단 출력]");
            }
            System.out.println(i + " * " + j + " = " + i*j );
            j++;
            if(j == 10) {
                i++; j = 1;
            }
        } // 와일써서 구구단... 우리 문제 중 하나
    }
}
