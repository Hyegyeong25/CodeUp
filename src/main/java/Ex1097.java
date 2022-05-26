import java.util.Scanner;

public class Ex1097 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] Baduk = new int[20][20];
        //바둑돌 넣기
        for(int i = 1; i < Baduk.length; i++) {
            for(int j = 1; j < Baduk[1].length; j++){
                Baduk[i][j] = scan.nextInt();
            }
        }
        //십자뒤집기 회수
        int n = scan.nextInt();
        for(int k = 0; k < n; k++){
            //좌표입력
            int x = scan.nextInt();
            int y = scan.nextInt();

            for(int j=1; j<20; j++) //가로 줄 흑<->백 바꾸기
            {
                if(Baduk[x][j]==0) Baduk[x][j]=1;
                else Baduk[x][j] = 0;
            }
            for(int j=1; j<20; j++) //세로 줄 흑<->백 바꾸기
            {
                if(Baduk[j][y]==0) Baduk[j][y]=1;
                else Baduk[j][y] = 0;
            }
        }
        for(int i = 1; i < Baduk.length; i++) {
            for(int j = 1; j < Baduk[1].length; j++){
                System.out.print(Baduk[i][j]+" ");
            }
            System.out.println();
        }
    }
}
