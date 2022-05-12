import java.util.Scanner;

public class Ex1419 {
    public static void main(String[] args) {
        // 문자열 검색
        // 값이 있으면 매개값으로 주어진 문자열이 시작되는 인덱스를 리턴
        // 아니면 -1을 출력
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] str = line.split(""); //1글자씩 자르기
        int count = 0;
        for(int i = 0; i<str.length; i++){
            if((str[i].equals("l"))&&(str[i+1].equals("o"))&&
                    (str[i+2].equals("v"))&&(str[i+3].equals("e"))){
                count++;
            }
        }
        System.out.println(count);
    }
}
