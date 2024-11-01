class Solution {
    public int arrangeCoins(int n) {
        long low=0;
        long high=n;
        long mid;
        while(low<high){
            mid=(low + high)/2;
            if((mid*(mid+1))/2 ==n){ return(int) mid;}
            if((mid*(mid+1))/2 < n && ((mid+1)*(mid+2))/2 > n ){ return(int) mid;}
            if((mid*(mid+1))/2 > n){ high=mid-1;}
            else{low=mid+1;}
        }
        return(int) low;
    }
}