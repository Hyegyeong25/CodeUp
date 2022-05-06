import java.util.Scanner;

public class Ex1403 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int cnt = 0, i = 0;
        for(int j = 0; j < n; j++){
            arr[j] = scan.nextInt();
        }
        while(true){
            if(cnt == n*2) break;
            if(i == n){ i = 0; }
            System.out.println(arr[i]);
            i++;
            cnt++;
        }
    }
}
