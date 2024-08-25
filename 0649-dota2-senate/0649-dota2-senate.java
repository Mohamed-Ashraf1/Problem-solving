class Solution {
    public String predictPartyVictory(String senate) {
        char[] s=senate.toCharArray();
        Queue<Integer> rQueue = new LinkedList<>();
        Queue<Integer> dQueue = new LinkedList<>();
       
        for(int i=0;i<s.length;i++){
            if(s[i]=='R'){
                rQueue.add(i);
            }else{
                dQueue.add(i);
            }
        }
        while(!rQueue.isEmpty()&&!dQueue.isEmpty()){
            if(rQueue.peek()<dQueue.peek()){
                dQueue.poll();
                int curr=rQueue.poll();
                rQueue.add(curr+s.length);

            }else{
                rQueue.poll();
                int curr=dQueue.poll();
                dQueue.add(curr+s.length);
            }
        }
        return rQueue.isEmpty()?"Dire":"Radiant";
        
    }
}