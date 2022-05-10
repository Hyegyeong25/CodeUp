import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> stu = new ArrayList<>();
        int i;
        for (i = 1; i <=23 ; i++) {
            stu.add(i); // ?? 이거 왜 해줬을까
        }
        int n = sc.nextInt(); // 10번 부르겠다
        int [] arr = new int[n];

        // 10개 입력 받아야지
        for (int j = 0; j <arr.length; j++) {
            arr[j] = sc.nextInt();
            if (i == arr[j]) {
                i++;
            }
        }
        for (int k = 0; k <stu.size(); k++) {
            System.out.println(stu);
        }
    }
}