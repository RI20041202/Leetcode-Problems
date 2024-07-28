class Solution {
    public int lengthOfLongestSubstring(String s) {
         int n = s.length();
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);
            if (map.containsKey(currentChar)) {
                left = Math.max(left, map.get(currentChar) + 1);
            }
            map.put(currentChar, right);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
