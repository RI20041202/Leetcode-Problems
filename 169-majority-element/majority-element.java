class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        Integer major=null;
        for(int arr: nums){
            if(count==0){
                major=arr;
            } 
            if(arr==major){
                count++;
            }else{
                count--;
            }
        }
        return major;
    }
}