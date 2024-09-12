public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={50,40,30,20,10};
        for (int i:arr){
            System.out.print(i+"  ");
        }
        System.out.println();
        bubbleSort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.print(i+"  ");
        }

    }
    public static void bubbleSort(int arr[],int i,int li){
        if(li==0){
            return;
        }
        if(i==li){
            bubbleSort(arr,0,li-1);
            return;
        }
        if(arr[i]>arr[i+1]){
            int temp=arr[i+1];
            arr[i+1]=arr[i];
            arr[i]=temp;
        }
        bubbleSort(arr,i+1,li);
    }
}
