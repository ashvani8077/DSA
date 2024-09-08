public class LowerBound {
    public static void main(String[] args) {

        int arr[]={1,2,2,2,2,3,3,3,9,11};
        System.out.println(lowerBound(arr,2));
    }
    public static int lowerBound(int arr[], int data){
        int lo=0;
        int hi=arr.length-1;
        int ans=-1;
        while (lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==data){
                ans=mid;
                hi=mid-1;
            }
            else if(arr[mid]>data){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
}
