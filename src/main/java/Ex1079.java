import java.util.Scanner;

public class Ex1079 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String arr = scan.nextLine();
        // arr을 입력받고 result에 split으로 값 저장
        String[] result = arr.split(" ");

        //q 입력받으면 break로 종료
        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
            if(result[i].equals("q")){
                break;
            }
        }
    }
}
