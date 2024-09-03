class Solution {
    public int getLucky(String s, int k) {
        StringBuilder numStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            int position = c - 'a' + 1;
            numStr.append(position); 
        }
        long sum = 0;
        for (char c : numStr.toString().toCharArray()) {
            sum += c - '0'; 
        }
        for (int i = 1; i < k; i++) {
            sum = digitsum(sum);
        }
        
        return (int) sum;
    }

    private long digitsum(long number) {
        long sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
