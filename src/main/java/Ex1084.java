import java.util.Scanner;

public class Ex1084 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int g = scan.nextInt();
        int b = scan.nextInt();

        for(int i = 0; i < r; i++){
            for(int j = 0; j < g; j++){
                for(int k = 0; k < b; k++){
                    System.out.println(i+" "+j+" "+k);
                }
            }
        }
    }
}
