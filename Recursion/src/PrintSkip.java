public class PrintSkip {
    public static void main(String[] args) {
        int n=5;
        printSkip(n);
    }
    public static void printSkip(int n){
        if(n==0){
            return;
        }
        if(n%2==1){
            System.out.println(n);
        }
        printSkip(n-1);
        if(n%2==0){
            System.out.println(n);
        }
    }
}
