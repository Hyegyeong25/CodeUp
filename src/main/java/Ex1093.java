import java.util.Arrays;
import java.util.Scanner;

public class Ex1093 {
    public static void main(String[] args){
        //첫 번째 줄에 출석 번호를 부른 횟수인 정수 n이 입력된다. (1 ~ 10000)
        //두 번째 줄에는 무작위로 부른 n개의 번호(1 ~ 23)가 공백을 두고 순서대로 입력된다.
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int[] nArr = new int[n1];
        int[] nCnt = new int[23];
        for(int i = 0; i < nArr.length; i++){
            nArr[i] = scan.nextInt();
            int cnt = nArr[i];
            nCnt[cnt-1]++;
        }
        for(int i = 0; i < nCnt.length; i++){
            System.out.print(nCnt[i]+" ");
        }
        //System.out.println(Arrays.toString(nCnt));
    }
}
