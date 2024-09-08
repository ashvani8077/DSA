public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={3,2,29,23,53,24,53,26};
        int targrt=24;
        System.out.println(linearSearch(targrt,arr));
    }
    public static int linearSearch(int target,int arr[]){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
