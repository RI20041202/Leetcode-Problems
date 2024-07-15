
   class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] count=new int[26];
        char[] arr1=s.toCharArray();
        char[] arr2=t.toCharArray();
        for(int i=0;i<arr1.length;i++){
            count[arr1[i]-'a']++;
        }
        for(int i=0;i<arr2.length;i++){
            if(count[arr2[i]-'a']==0){
                return false;
            }
            count[arr2[i]-'a']--;
        }
        return true;
    }
}
