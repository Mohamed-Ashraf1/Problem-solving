class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        double maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(i<k){
                sum+=nums[i];
                maxSum=sum;
            }else{
                sum-=nums[i-k];
                sum+=nums[i];
                maxSum=Math.max(sum,maxSum);
            }
        }
        return maxSum/k;

    }
}