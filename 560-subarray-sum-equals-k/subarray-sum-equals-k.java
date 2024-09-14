class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1);
        
        int cumulative = 0;
        int count = 0;
        for (int num : nums) {
            cumulative += num;
            if (prefixSumCount.containsKey(cumulative - k)) {
                count += prefixSumCount.get(cumulative - k);
            }
            prefixSumCount.put(cumulative, prefixSumCount.getOrDefault(cumulative, 0) + 1);
        }
        
        return count;
    }
}