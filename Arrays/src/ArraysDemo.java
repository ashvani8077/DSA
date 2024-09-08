public class ArraysDemo {
    public static void main(String[] args) {
        int arr[]=null;
        System.out.println(arr);
        arr=new int[5];
        System.out.println(arr[0]);
        arr[0]=5;
        System.out.println(arr[0]);
        arr[1]=40;
        arr[2]=12;
        arr[3]=34;
        arr[4]=54;
        arr[0]=43;
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
