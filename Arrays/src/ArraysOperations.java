import java.util.Scanner;

public class ArraysOperations {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Size of array:");
        int size=sc.nextInt();
        int arr[]=userInput(size);
        arrayPrint(arr);

    }
    public static int[] userInput(int size){
        int arr[]=new int[size];
        for (int i=0;i<size;i++){
            System.out.println("Enter Value on index: "+i);
            arr[i]=sc.nextInt();
        }return arr;
    }

    public static void arrayPrint(int arr[]){
        System.out.println("Below is the result: 0");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
