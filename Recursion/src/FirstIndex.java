public class FirstIndex {
    public static void main(String[] args) {
        int arr[]={6,8,1,1,8,3,4};
        int data=3;
        int idx=firstIndex(arr,0,data);
        System.out.println(idx);
    }
    public static int firstIndex(int arr[],int i,int data){
        if(arr.length==i){
            return -1;
        }
        if(arr[i]==data){
            return i;
        }
        else {
            int ans=firstIndex(arr,i+1,data);
            return ans;
        }
    }
}
