public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={88,66,55,44,22};
        for (int i:arr){
            System.out.print(i+"  ");
        }
        System.out.println();
        bubbleSort(arr);
        for (int i:arr){
            System.out.print(i+"  ");
        }
    }
    public static void bubbleSort(int arr[]){
        for (int counter=0;counter<arr.length;counter++){
            for (int j=0;j<arr.length-1-counter;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
