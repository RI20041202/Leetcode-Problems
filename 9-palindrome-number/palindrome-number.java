class Solution {
    public boolean isPalindrome(int x) {
        if(x==0) return true;
        if(x<0 || x%10==0) return false;
        int num=0;
        while(x>num){
            int digit=x%10;
            x/=10;
            num=(num*10)+digit;
        }
    if(x==num ||x==num/10){
        return true;
    }else{
        return false;
    }
    }
}