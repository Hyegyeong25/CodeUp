public class Test {
    public static void main(String[] args) {
        int hap = 0;
        for(int i = 50; i < 101; i++){
            if((i % 3 != 0) && (i % 7 != 0) && (i % 11 != 0)){
                //(i % 3 == 0) || (i % 7 == 0) || (i % 11 == 0)
                hap += i;
            } else {
                //hap += i;
            }
        }
        System.out.println(hap);
    }
}
