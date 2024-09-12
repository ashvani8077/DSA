import java.util.Scanner;

public class SpiralPrint {
    public static void main(String[] args) {
        int arr[][]=new int[4][4];
        System.out.println("Enter Values: ");
        inputArray(arr);
        spiralPrint(arr);

    }
    public static void inputArray(int arr[][]){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
    public static void spiralPrint(int arr[][]){
        int left=0;
        int right=arr[0].length-1;
        int top=0;
        int bottom=arr.length-1;
        int count=(bottom+1)*(right+1);
        int dir=1;
        while (left<=right && top<=bottom){
            if(dir==1 && count>0){
                for (int i=left;i<=right;i++){
                    System.out.print(arr[top][i]+" ");
                    count--;
                }
                dir=2;
                top++;
            }
            if(dir==2 && count>0){
                for (int i=top;i<=bottom;i++){
                    System.out.print(arr[i][right]+" ");
                    count--;
                }
                dir=3;
                right--;
            }
            if(dir==3 && count>0){
                for (int i=right;i>=left;i--){
                    System.out.print(arr[bottom][i]+" ");
                    count--;
                }
                dir=4;
                bottom--;
            }
            if(dir==4 && count>0){
                for (int i=bottom;i>=top;i--){
                    System.out.print(arr[i][left]+" ");
                    count--;
                }
                dir=1;
                left++;
            }
            System.out.println();
        }
    }
}
