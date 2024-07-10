class Solution {
    public String reverseWords(String s) {
        StringBuilder reverse = new StringBuilder();
        int i = 0;
        int n = s.length();

        while (i < n) {
            while (i < n && s.charAt(i) == ' ') {
                i++;
            }

            if (i >= n) {
                break;
            }
            int j = i + 1;
            while (j < n && s.charAt(j) != ' ') {
                j++;
            }
            String sub = s.substring(i, j);
            if (reverse.length() == 0) {
                reverse.append(sub);
            } else {
                reverse.insert(0, sub + " ");
            }

            i = j + 1;
        }

        return reverse.toString();
    }
}
