package Exam0419;

public class Test {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;

        for(int i = 1; i < 10; i++){
            for(int j = 1; j <= b; j++){
                if(j <= a) {
                    System.out.print(" ");
                } else if(j <= b){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            if(i < 5){
                a--;
                b++;
            } else {
                a++;
                b--;
            }
        }
    }
}
