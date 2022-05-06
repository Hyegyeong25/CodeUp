import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] Baduk = new int[20][20];
        int n = scan.nextInt();
        for(int k = 0; k < n; k++){
            int i = scan.nextInt();
            int j = scan.nextInt();
            Baduk[i][j] = 1;
        }
        for(int i = 1; i < Baduk.length; i++) {
            for(int j = 1; j < Baduk[1].length; j++){
                System.out.print(Baduk[i][j] + " ");
            }
            System.out.println();
        }

    }
}
