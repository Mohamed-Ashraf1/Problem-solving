class Solution {
    public boolean lemonadeChange(int[] bills) {
        int numOf5=0,numOf10=0;
        for(int bill:bills){
            if(bill==5){
                numOf5++;
            }else if(bill==10&&numOf5!=0){
                numOf5--;
                numOf10++;
            }else if(bill ==20 ){
                if(numOf10!=0&&numOf5!=0){
                    numOf5--;
                    numOf10--;
                }else if(numOf10==0&&numOf5>2){
                    numOf5-=3;
                }else{
                    return false;
                }

            }else{
                return false;
            }
           
        }
         return true;
    }
}