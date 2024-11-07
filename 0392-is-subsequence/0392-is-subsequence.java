class Solution {
    public boolean isSubsequence(String s, String t) {
        if(t.length()<s.length())
            return false;
        
        if(s.length()==0 )
            return true;
            
        int i=0,j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                if(i==s.length())
                    return true;
            
            }
            // if(j==t.length()-1 && i== s.length()-1&& s.charAt(i)!=t.charAt(j)){
            //     return false;
            // }
            j++;

        }
        return false;
    }
}