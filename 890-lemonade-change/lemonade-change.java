class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n=bills.length;
        int fives=0;
        int tens=0;
        for(int arr:bills){
            if(arr==5){
                fives++;
            }else if(arr==10){
                if(fives==0) return false;
                tens++;
                fives--;
            }else if(arr==20){
                if(fives>0 && tens>0){
                    tens--;
                    fives--;
                }else if(fives>2){
                    fives-=3;
                }else{
                    return false;
                }
            }
        }
        return true;

    }
}