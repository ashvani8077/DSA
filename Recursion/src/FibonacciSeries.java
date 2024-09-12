public class FibonacciSeries {
    public static void main(String[] args) {
        int n=6;
        System.out.println(fibonacciSeries(n));
    }
    public static int fibonacciSeries(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else {
            return fibonacciSeries(n-1)+fibonacciSeries(n-2);
        }
    }
}
