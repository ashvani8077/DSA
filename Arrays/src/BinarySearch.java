public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={19,23,43,52,61,75,83,92,95};
        int target=61;
        System.out.println(binarySearch(arr,target));
    }
    public static int binarySearch(int arr[],int target){
        int lo=0;
        int hi=arr.length-1;
        while (lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return -1;
    }
}
