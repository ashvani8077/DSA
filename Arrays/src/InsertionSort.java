public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {99, 88, 77, 66, 55};
        for (int i : arr) {
            System.out.print(i + "  ");
        }
        System.out.println();
        insertionSort(arr);
        for (int i : arr) {
            System.out.print(i + "  ");
        }
    }
    public static void insertionSort(int arr[]){
        for (int counter=1;counter<arr.length;counter++){
            int val=arr[counter];
            int j=counter-1;
            while (j>=0 && arr[j]>val){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=val;
        }
    }

}
