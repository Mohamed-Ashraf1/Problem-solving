class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }

        int num =x;
        int reversed=0;
        while(num>0){
            reversed=reversed*10+num%10;
            num=num/10;
        }
        if(x==reversed){
            return true;
        }else{
            return false;
        }

    }
}