import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String arr = scan.nextLine();
        String[] result = arr.split(" ");
        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
            if(result[i].equals("q")){
                break;
            }
        }
    }
}
