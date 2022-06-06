import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        Integer card;
        List<Integer> list = new ArrayList<Integer>();

        for(int i=1; i <= num; i++){
            list.add(i);
        }
        for(int i=1; i< num; i++){
            card = scan.nextInt();
            list.remove(Integer.valueOf(card)); // List에는 객체만 들어갈 수 있음
        }
        System.out.println(list.get(0));
    }
}

