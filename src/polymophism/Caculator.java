package polymophism;

public class Caculator {
    // Nạp chồng
    public static int sum(int a , int b){
        return a + b;
    }

    public static int sum(int a , int b, int c){
        return a + b + c;
    }

    public static double sum(double a , double b){
        return a + b;
    }

    public static int sum(int[] a){
        int sum = 0;
        for (int i : a){
            sum += i;
        }
        return sum;
    }

}
