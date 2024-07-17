class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int max=0;
        while(i<j){
            int leftpointer=height[i];
            int rightpointer=height[j];
            int area=Math.min(leftpointer,rightpointer)*(j-i);
            max=Math.max(max,area);
            if(leftpointer<rightpointer){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}