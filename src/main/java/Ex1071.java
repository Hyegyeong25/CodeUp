import java.util.Scanner;

public class Ex1071 {
    public static void main(String[] args) {
        //String[] result = num.split("0");
        //System.out.println(result[0]);
        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();
        String[] result = num.split(" ");
        for(int i = 0; i < result.length; i++){
            if(result[i].equals("0")) {
                break;
            }
            System.out.println(result[i]);
        }
    }
}

