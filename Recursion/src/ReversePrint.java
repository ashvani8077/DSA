public class ReversePrint {
    public static void main(String[] args) {
        int n=5;
        reversePrint(n);
    }
    public static void reversePrint(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        reversePrint(n-1);
    }
}
