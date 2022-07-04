import java.util.Scanner;

public class Ex2322 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] blood = scan.nextLine().split(" ");

        for(String btype : blood){
            System.out.println(btype);
            if(btype.equals("AA") || btype.equals("AO") ){
                System.out.print("A ");
            }
            if(btype.equals("AB")){
                System.out.print("AB ");
            }
            if(btype.equals("BB") || btype.equals("BO") ){
                System.out.print("B ");
            }
            if(btype.equals("OO")){
                System.out.print("OO ");
            }
        }
    }
}
