import java.util.Scanner;

public class Ex1425 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int c = scan.nextInt();
        int a;
        if( n/c == 0 ) a = n/c; else a = n/c+1;
        int[] height = new int[n];
        int[][] desk = new int[a][c];

        //입력받음
        for (int i = 0; i < height.length; i++) {
            height[i] = scan.nextInt();
        }
        //순차정렬
        for (int i = 0; i < height.length; i++) {
            for (int j = 0; j < height.length-1; j++) {
                if(height[j] > height[j+1]){
                    int temp = height[j];
                    height[j] = height[j+1];
                    height[j+1] = temp;
                }
            }
        }

        int cnt = 0;
        for(int j = 0; j < a; j++){
            for(int i = 0; i < c; i++){
                if(cnt < n){
                    desk[j][i] = height[cnt];
                    cnt++;
                }
            }
        }

        for(int j = 0; j < a; j++){
            for(int i = 0; i < c; i++){
                if(desk[j][i] > 0) System.out.printf("%d ", desk[j][i]);
            }
            System.out.println();
        }
    }
}
