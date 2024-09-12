public class LastIndex {
    public static void main(String[] args) {
        int arr[]={6,8,1,1,8,3,4};
        int data=8;
        int idx=lastIndex(arr,0,data);
        System.out.println(idx);
    }
    public static int lastIndex(int arr[],int i, int data){
        if(arr.length==i){
            return -1;
        }
        int index=lastIndex(arr,i+1,data);
        if(index==-1){
            if(arr[i]==data){
                return i;
            }
            else {
                return -1;
            }
        }
        else {
            return index;
        }
    }
}
