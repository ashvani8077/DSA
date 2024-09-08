public class ArrayMax {
    public static void main(String[] args) {
        int arr[]={20,32,13,43,23,12,5};
        System.out.println(maximumValue(arr));
        int m= ArrayMax.maximumValue(arr);
        System.out.println(m);
    }
    public static int maximumValue(int arr[]){
        int max=Integer.MIN_VALUE;
        for (int i:arr){
            if(i>max){
                max=i;
            }
        }
        return max;
    }
}
