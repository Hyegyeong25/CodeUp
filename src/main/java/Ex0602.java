public class Ex0602 {
    public static void main(String[] args) {
        System.out.println("plus : "+plus(5, 3));
        System.out.println("minus : "+minus(5, 3));
        System.out.println("multi : "+multi(5, 3));
        System.out.println("divide : "+divide(5, 3));
    }
    public static int plus(int a, int b){
        return a+b;
    }
    public static int minus(int a, int b){
        return a-b;
    }
    public static double multi(int a, int b){
        return a*b;
    }
    public static double divide(int a, int b){
        return (double)a/b;
    }
}
