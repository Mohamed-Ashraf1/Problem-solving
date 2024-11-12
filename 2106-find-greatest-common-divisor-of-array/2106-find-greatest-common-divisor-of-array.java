class Solution {
    public int findGCD(int[] nums) {
        int min=1001,max=0;
        for(int num:nums){
            min=Math.min(min,num);
            max=Math.max(max,num);
        }
        int gcd=1;
        for(int i=1;i<=min;i++){
            if(min % i==0 && max%i==0){
                gcd=i;
            }
        }
        return gcd;

    }
}