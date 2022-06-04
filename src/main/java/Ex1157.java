import java.util.Scanner;

public class Ex1157 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().toUpperCase();
        int[] alphabet = new int[26]; //A~Z 개수 세기

        for (int i = 0; i < str.length(); i++) {
            int num = (int)str.charAt(i)-65;
            alphabet[num] += 1;
        }

        int max = alphabet[0];
        String alphaNum = "0";
        for (int i = 1; i < alphabet.length; i++) {
            if(max < alphabet[i]){
                max = alphabet[i];
                alphaNum = i+"";
            } else if(max == alphabet[i]){
                max = alphabet[i];
                alphaNum = "?";
            }
        }

        if(alphaNum.equals("?")) {
            System.out.println(alphaNum);
        } else {
            System.out.printf("%c", Integer.parseInt(alphaNum)+65);
        }
    }
}
