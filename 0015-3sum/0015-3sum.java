class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result=new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
            int minus=nums[i]*-1;
            int start=i+1,end=nums.length-1;
            while(start<end){
                if(nums[start]+nums[end]==minus){
                    result.add(List.of(nums[i],nums[start],nums[end]));
                    start++;
                    end--;
                    
                }else if(nums[start]+nums[end]>=minus){
                    end--;
                }else{
                    start++;
                }
                
            }

        }
        return result.stream().collect(Collectors.toList());
    }
    
}