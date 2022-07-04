import java.util.Scanner;

class Ex1082 {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(16);
        for(int i = 1; i < 16; i++) {
            System.out.printf("%x * %x = %x \n", n, i, n * i);
        }
    }
}
