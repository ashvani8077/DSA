public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={99,88,77,66,55};
        for (int i:arr){
            System.out.print(i+"  ");
        }
        System.out.println();
        selectionSort(arr);
        for (int i:arr){
            System.out.print(i+"  ");
        }
    }
    public static void selectionSort(int arr[]){
        for(int counter=0;counter<arr.length-1;counter++){
            int min=counter;
            for(int j=counter+1;j<=arr.length-1;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[counter];
            arr[counter]=temp;
        }
    }
}
