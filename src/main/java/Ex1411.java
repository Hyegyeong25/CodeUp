import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex1411 {
    public static void main(String[] args) {
        // 숫자 n 입력받고 1~n 사이의 n-1개 숫자입력
        // n까지 중에서 빠진 수 찾기
        /*
        * Arryas.sort()
        * 1~입력받은 수 합 -> 입력받은거 빼기
        * */
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt(); //num 입력받음

        //사용자에게 입력받을 배열(방은 빠진 숫자 1개 제외하고 잡기)
        int[] card = new int[num-1];
        //1~num까지 입력받을 list

        List<Integer> list = new ArrayList<Integer>();

        for(int i=1; i <= num; i++){
            list.add(i); // 1부터 입력받은 num까지 숫자 집어넣음
        }
        for(int i=0; i< num-1; i++){
            card[i] = scan.nextInt(); //사용자에게 입력받고
            // list에서 입력받은 값 지움 -> 최종적으로 list에 남는 값은 1개임
            list.remove(Integer.valueOf(card[i]));
        }
        // list를 그냥 출력하면 [ ] << 괄호 안에 쌓여진 형태임
        // 괄호 제거를 위해 list를 String 형태로 바꿔주는 작업을 함
        //String split = list.toString();
        // 이후 replace로 괄호를 공백으로 치환해줌
        //split = split.replace("[", "").replace("]", "");
        //최종적인 값 출력

        //list.get(0) 매우 굿...
        System.out.println(list.get(0));


    }
}

