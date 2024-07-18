class Solution {
    public int maxSubArray(int[] nums) {
        int maxarr=nums[0];
        int currmax=nums[0];
        for(int i=1;i<nums.length;i++){
            currmax=Math.max(nums[i], currmax+nums[i]);
            maxarr=Math.max(currmax,maxarr);
        }
        return maxarr;
    }

}