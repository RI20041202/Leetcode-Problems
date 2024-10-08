class Solution {
    public int minSwaps(String s) {
        int balance = 0;
        int swap = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                balance++;
            } else {
                
                balance--;
            }
            if (balance < 0) {
                swap++;
                balance = 1;
            }
        }
        
        return swap;
    }
}