class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
   
         Map<String, List<String>> count = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] temp=strs[i].toCharArray();
            Arrays.sort(temp);
            String word=new String(temp);
            if(!count.containsKey(word)){
                count.put(word, new ArrayList<>());
            }
            count.get(word).add(strs[i]);
        }
       
    
       
        return new ArrayList<>(count.values());
    }
}