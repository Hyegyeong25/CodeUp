import java.util.Scanner;

public class Ex1073 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();
        String[] result = num.split(" ");
        int i = 0;
        while(true){
            if(result[i].equals("0")) {
                break;
            }
            System.out.println(result[i]);
            i++;
        }
    }
}
