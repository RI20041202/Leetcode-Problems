class Solution {
    public int removeDuplicates(int[] nums) {
        int unique=1;
        for(int i=1;i<nums.length;i++){
            if(unique==1 || nums[i]!=nums[unique-2]){
                nums[unique++]=nums[i];
            }
        }
        return unique;
    }
}