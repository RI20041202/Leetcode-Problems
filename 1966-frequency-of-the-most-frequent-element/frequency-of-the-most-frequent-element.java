class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);  
        int maxFrequency = 1;
        int j = 0; 
        long total = 0;

        for (int i = 1; i < nums.length; i++) {
            total += (long) (nums[i] - nums[i - 1]) * (i - j);
            
            while (total > k) {
                total -= nums[i] - nums[j];
                j++;
            }
            
            maxFrequency = Math.max(maxFrequency, i - j + 1);
        }

        return maxFrequency;
    }
    }
