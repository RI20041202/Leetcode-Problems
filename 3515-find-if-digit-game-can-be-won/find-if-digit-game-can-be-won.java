class Solution {
    public boolean canAliceWin(int[] nums) {
        int i=0;
        int j=0;
        for(int arr : nums){
        if(arr<10){
            i+=arr;
        }else{
            j+=arr;
        }
        }
        return i>j || j>i;
    }
}