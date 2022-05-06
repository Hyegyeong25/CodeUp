public class Test {
    public static void main(String[] args) {
        System.out.println("1번");
        for(int i = 3; i < 9; i++){
            for(int j = 2; j < 7; j++){
                System.out.println(i + "X" + j + "=" + i*j );
            }
        }

        System.out.println("2번");
        int hap = 0;
        for(int i = 50; i < 101; i++){
            if(!( (i % 3 == 0) || (i % 7 == 0) || (i % 11 == 0) )){
                hap += i;
            }
        }
        System.out.println(hap);
    }
}


