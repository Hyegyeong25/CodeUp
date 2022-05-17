import java.util.Scanner;

public class Ex1228 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double height = scan.nextDouble();
        double weight = scan.nextDouble();

        double standard = (height - 100) * 0.9;
        double obesity = (weight - standard) * 100 / standard;

        if (obesity > 20) {
            System.out.println("비만");
        } else if (obesity > 10) {
            System.out.println("과체중");
        } else {
            System.out.println("정상");
        }

    }
}
