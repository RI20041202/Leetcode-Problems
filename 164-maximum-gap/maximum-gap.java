class Solution {
    public int maximumGap(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int arr : nums) {
            min = Math.min(min, arr);
            max = Math.max(max, arr);
        }
        if (min == max) {
            return 0;
        }

        int n = nums.length;
        int gap = (int) Math.ceil((double) (max - min) / (n - 1));
        
        int[] bucketsMin = new int[n - 1];
        int[] bucketsMax = new int[n - 1];
        Arrays.fill(bucketsMin, Integer.MAX_VALUE);
        Arrays.fill(bucketsMax, Integer.MIN_VALUE);
        for (int num : nums) {
            if (num == min || num == max) {
                continue;
            }
            int idx = (num - min) / gap;
            bucketsMin[idx] = Math.min(bucketsMin[idx], num);
            bucketsMax[idx] = Math.max(bucketsMax[idx], num);
        }
        int maxGap = 0;
        int previous = min;

        for (int i = 0; i < n - 1; i++) {
            if (bucketsMin[i] == Integer.MAX_VALUE && bucketsMax[i] == Integer.MIN_VALUE) {
                continue; 
            }
            maxGap = Math.max(maxGap, bucketsMin[i] - previous);
            previous = bucketsMax[i];
        }
        maxGap = Math.max(maxGap, max - previous);

        return maxGap;
    }
}