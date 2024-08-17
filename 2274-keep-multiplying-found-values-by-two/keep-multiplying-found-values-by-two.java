class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set=new HashSet<>();
        for(int arr:nums){
            set.add(arr);
        }
        while(set.contains(original)){
            original*=2;
        }
        return original;
    }
}