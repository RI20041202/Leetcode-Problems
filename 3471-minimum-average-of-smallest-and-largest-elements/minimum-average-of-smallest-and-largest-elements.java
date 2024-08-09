class Solution {
    public double minimumAverage(int[] nums) {
         Arrays.sort(nums);
        int n = nums.length;
        double minAverage = Double.MAX_VALUE;
        for (int i = 0; i < n / 2; i++) {
            double average = (nums[i] + nums[n - 1 - i]) / 2.0;
            if (average < minAverage) {
                minAverage = average;
            }
        }

        return minAverage;
    }
}