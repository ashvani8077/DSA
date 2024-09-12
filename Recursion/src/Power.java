public class Power {
    public static void main(String[] args) {
        int n=2;
        int pow=10;
        System.out.println(powerPrint(n,pow));
    }
    public static int powerPrint(int n,int pow){
        if(pow==0){
            return 1;
        }
        return n*powerPrint(n,pow-1);
    }
}
