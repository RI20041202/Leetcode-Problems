class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> res=new ArrayList<>();
    for(int i=left;i<=right;i++){
        if(self(i)){
            res.add(i);
        }
    }
    return res;
    }     
     public static boolean self(int num){
        int k=num;
        while(num>0){
            int digit=num%10;
            if(digit==0 ||k%digit!=0){
                return false;
            }
            num/=10;
        }
        return true;
    }
}