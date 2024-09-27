class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] sortedArr=new String[strs.length];
        List<List<String>> result=new ArrayList();
        for(int i=0;i<strs.length;i++){
            char[] temp=strs[i].toCharArray();
            Arrays.sort(temp);
            sortedArr[i]=new String(temp);
        }
        Map<String, List<Integer>> count = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            List<Integer> indices = count.getOrDefault(sortedArr[i], new ArrayList<>());
            indices.add(i);
            count.put(sortedArr[i], indices);
           
        }
        for (List<Integer> list : count.values()) {
            List<String> l=new ArrayList();
            for(int i:list){
                l.add(strs[i]);
            }
            result.add(l);

        }
        return result;
    }
}