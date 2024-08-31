class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[]res=new int[n];
        int positive=0;
        int negative=1;
        for(int arr:nums){
            if(arr>0){
                res[positive]=arr;
                positive+=2;
            }else{
                res[negative]=arr;
                negative+=2;
            }
        }
        return res;
    }
}