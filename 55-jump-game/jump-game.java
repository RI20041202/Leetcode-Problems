class Solution {
    public boolean canJump(int[] nums) {
        int further=0;
        for(int i=0;i<nums.length;i++){
            if(i>further){
                return false;
            }
            further=Math.max(further,i+nums[i]);
            if(further>=nums.length-1){
                return true;
            }
        }
        return false;
    }
}