package Exam0418;

public class Diamond {
    public static void main(String[] args) {
        int inc = 5;
        int dec = 5;

        for( int i = 1; i < 5 * 2; i++){
            for (int j = 1; j <= inc; j++){
                if(j < dec) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            if(i < 5) {
                inc++; dec--;
            } else {
                inc--; dec++;
            }
            System.out.println();
        }
    }
}
