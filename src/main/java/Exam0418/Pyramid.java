package Exam0418;

public class Pyramid {
    public static void main(String[] args){
        int k = 1;

        for(int i = 1; i < 5*2; i++){
            for(int j = 1; j <= k; j++){
                System.out.print("*");
            }
            System.out.println();
            if(i < 5) {
                k++;
            } else {
                k--;
            }
        }
    }
}
