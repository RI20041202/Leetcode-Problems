class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> word = new ArrayList<>();
        word.addAll(Arrays.asList(s1.split(" ")));
        word.addAll(Arrays.asList(s2.split(" ")));
        List<String> result = new ArrayList<>();
        for (String words : word) {
            if (Collections.frequency(word, words) == 1) {
                result.add(words);
            }
        }
        return result.toArray(new String[0]);
    }

        
}