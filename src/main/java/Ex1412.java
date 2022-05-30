import java.util.Scanner;

public class Ex1412 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int[] alphabet = new int[26];

        for (int i = 0; i < str.length(); i++) {
            int num = (int)str.charAt(i)-97;
            if(num > -1 && num < 26) {
                alphabet[num] += 1;
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.printf("%c : %d \n", 97+i, alphabet[i]);
        }
    }
}
