class SmallestInfiniteSet {

    PriorityQueue<Integer> pQueue; 
    public SmallestInfiniteSet() {
        pQueue = new PriorityQueue<Integer>();
        for(int i=1;i<=1000;i++){
            pQueue.add(i);
        }
    }
    
    public int popSmallest() {
        return pQueue.poll();
    }
    
    public void addBack(int num) {
        if(!pQueue.contains(num))
            pQueue.add(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */