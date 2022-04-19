import java.util.Scanner;

public class Ex1079_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = str.replaceAll(" ", "");
        for(int i = 0; i < str.length(); i++){
            char temp = str.charAt(i);
            System.out.println(temp);
            if(temp=='q'){
                break;
            }
        }
    }
}
