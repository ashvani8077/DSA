import java.util.Scanner;

public class WavePrint {
    public static void main(String[] args) {
        int arr[][]=new int[4][4];
        System.out.println("Enter Values:");
        inputArray(arr);
        wavePrint(arr);
    }
    public static void inputArray(int arr[][]){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
    public static void wavePrint(int arr[][]){
        for (int i=0;i<arr.length;i++){
            if(i%2==0){
                for(int j=0;j<arr.length;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int j=arr.length-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
