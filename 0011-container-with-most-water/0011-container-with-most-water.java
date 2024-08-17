class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1,max=0;
        while(l<r){
            int water=Math.min(height[l],height[r]) * (r-l);
            max=Math.max(max,water);
            if(height[l]>height[r]){
                r--;
            }else{
                l++;
            }
            
        }
        return max;
        
    }
}