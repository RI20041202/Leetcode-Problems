class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> note=new HashMap<>();
        
        for(char st: magazine.toCharArray()){
            note.put(st,note.getOrDefault(st,0)+1);
        }
        for(char st:ransomNote.toCharArray()){
            if(!note.containsKey(st) || note.get(st)==0){
                return false;
            }
            note.put(st,note.get(st)-1);
        }
        return true;
    }
}