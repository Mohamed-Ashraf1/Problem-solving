class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                List<Integer> indices=new ArrayList<Integer>();
                indices.add(i);
                map.put(nums[i],indices);
            }else{
                List<Integer> indices=map.get(nums[i]);
                for(Integer index:indices){
                    if(Math.abs(index-i)<=k){
                        return true;
                    }
                }
                indices.add(i);
                map.put(nums[i],indices);

            }
        }
        return false;
    }
}