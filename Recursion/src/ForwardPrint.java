public class ForwardPrint {
    public static void main(String[] args) {
        int n=5;
        forwardPrint(n);
    }
    public static void forwardPrint(int n){
        if(n==0){
            return;
        }
        forwardPrint(n-1);
        System.out.println(n);
    }
}
