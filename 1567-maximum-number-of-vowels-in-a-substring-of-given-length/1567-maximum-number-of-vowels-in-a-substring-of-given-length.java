class Solution {
    public int maxVowels(String s, int k) {
        int count =0;
        int numOfVowels=0;
        Set<String> hashSet = new HashSet<String>();
        hashSet.add("a");
        hashSet.add("e");
        hashSet.add("i");
        hashSet.add("o");
        hashSet.add("u");
        for(int i = 0;i<k;i++){
            
        }
        for(int i=0;i<s.length();i++ ){
            if(i<k){
                if (hashSet.contains(String.valueOf(s.charAt(i)))){
                numOfVowels++;
                count++;
            }
            }else{
                if(hashSet.contains(String.valueOf(s.charAt(i-k)))){
                numOfVowels--;
            }
            if(hashSet.contains(String.valueOf(s.charAt(i)))){
                numOfVowels++;
                count=Math.max(count,numOfVowels);
            }
            
            }
        }
        return count;
    }
}