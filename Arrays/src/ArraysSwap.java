import java.util.Scanner;

public class ArraysSwap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int [8];
        System.out.println("Input Values");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //Your task is to swap the of last value fo array to first value of array
        System.out.println("Before Swap");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        swap(0,arr.length-1,arr);
        System.out.println("After Swap");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void swap(int a,int b, int arr[]){
        int start=a;
        int end=b;
        int temp=0;
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

    }
}
