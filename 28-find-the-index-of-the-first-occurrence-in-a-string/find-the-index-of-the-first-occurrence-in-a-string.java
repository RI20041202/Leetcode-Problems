class Solution {
    public int strStr(String haystack, String needle) {
       if (needle.isEmpty()) {
            return 0;
        }
        int p = haystack.length();
        int q = needle.length();

        for (int i = 0; i <= p - q; i++) {
            if (haystack.substring(i, i + q).equals(needle)) {
                return i;
            }
        }
        
        return -1;
    }
}