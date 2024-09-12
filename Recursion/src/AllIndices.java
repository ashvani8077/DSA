public class AllIndices {
    public static void main(String[] args) {
        int arr[]={3,8,1,8,8,4};
        int ans[]=allIndices(arr,0,0,8);
        display(ans);

    }
    public static int[] allIndices (int arr[], int i, int count, int data){
        if(arr.length==i){
            int base[]=new int[count];
            return base;
        }
        int indices[]=null;
        if(arr[i]==data){
            indices=allIndices(arr,i+1,count+1,data);
        }
        else {
            indices=allIndices(arr,i+1,count,data);
        }
        if(arr[i]==data){
            indices[count]=i;
        }
        return indices;
    }
    public static void display(int ans[]){
        for (int i:ans){
            System.out.print(i+" ");
        }
    }
}
