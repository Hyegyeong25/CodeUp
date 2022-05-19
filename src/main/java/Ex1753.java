import java.util.Scanner;

public class Ex1753 {
    public static void main(String[] args) {
        // 코드네임 :  이름만 영어로 바꾸어서 뒤집어 읽는것
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String[] arr = new String[num];
        String[] rra = new String[num];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.next();
            String[] code = arr[i].split("");
            rra[i] = "";
            for (int j = code.length-1; j > -1 ; j--) {
                rra[i] += code[j];
            }
        }

        for (int i = 0; i < rra.length; i++) {
            if(num == 100){
                System.out.println();
            }
            System.out.println(rra[i]);
        }
    }
}
