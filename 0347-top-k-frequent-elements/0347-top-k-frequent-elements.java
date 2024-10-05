class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
         PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
         int[] result=new int[k];
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
       
        pQueue.addAll(map.values());
        
        while(k>0){
            int val=pQueue.poll();
            int key=map.entrySet().stream().filter(entry -> entry.getValue().equals(val)) 
                        .map(Map.Entry::getKey).findFirst().orElse(-1);                              
            result[k-1]=key;
            map.remove(key);
            k--;

        }

return result;
        
    }
}