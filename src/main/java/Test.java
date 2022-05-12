public class Test {
    public static void main(String[] args) {
        int a[] = {1000, 20, 40, 40, 100000, 100, 1, 100000, 1, 100000, 1, 100000};
        int b[][] = new int[a.length][2];

        for(int i = 0; i < a.length; i++){
            for(int j = i; j < a.length; j++){
                if(b[i][0] == a[j]){
                    b[i][1]++;
                } else if(b[i][0] == 0){
                    b[i][0] = a[j];
                    b[i][1]++;
                }
            }
        }
        int c[][] = new int[a.length][2];
        System.arraycopy(b, 0, c, 0, a.length);
        for(int i = 1; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                if(i != j && c[j][0] == b[i][0] ) c[j][0] = 0;
            }
        }
        for(int i = 0; i < c.length; i++){
            if(c[i][0] != 0)
                System.out.println(i+ " : " + c[i][0] + " -> " + c[i][1]);
        }
    }
}