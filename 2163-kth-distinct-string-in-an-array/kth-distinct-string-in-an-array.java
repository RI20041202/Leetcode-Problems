class Solution {
    public String kthDistinct(String[] arr, int k) {

        Map<String, Integer> count = new HashMap<>();
        List<String> distinct = new ArrayList<>();

        for (String s : arr) {
            count.put(s, count.getOrDefault(s, 0) + 1);
        }
        for (String s : arr) {
            if (count.get(s) == 1) {
                distinct.add(s);
            }
        }
        if (k <= distinct.size()) {
            return distinct.get(k - 1);
        } else {
            return "";
        }
    }
        
}