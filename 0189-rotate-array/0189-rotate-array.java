class Solution {
    public void rotate(int[] nums, int k) {
        int size=nums.length;
        k = k % size;
        reverse(nums,0,size-1);
        reverse(nums,0,k-1);
        reverse(nums,k,size-1);
 
    }
    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp =arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}