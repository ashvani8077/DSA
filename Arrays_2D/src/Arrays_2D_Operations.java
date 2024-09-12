import java.util.Scanner;

public class Arrays_2D_Operations {
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        System.out.println(arr[0][0]);
        System.out.println("Entetr Values of Array: ");
        inputArray(arr);
        System.out.println("Values Are: ");
        displayArray(arr);
    }
    public static void displayArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void inputArray(int arr[][]){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
}
