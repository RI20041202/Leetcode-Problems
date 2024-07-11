class Solution {
    public int hIndex(int[] citations) {
        int num=citations.length;
        int[] count=new int[num+1];
        for(int arr : citations){
            if(arr>=num){
                count[num]++;
            }else{
                count[arr]++;
            }
        }
        int paper=0;
        for(int hIndex=num;hIndex>=0;hIndex--){
            paper=paper+count[hIndex];
            if(paper>=hIndex){
                return hIndex;
            }
        }
        return 0;
    }
}