class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        Integer[] integerArray = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        p.addAll(Arrays.asList(integerArray));
        int i=1;
        while(i<k){
            p.poll();
            i++;
        }
        return p.poll();

    }
}