class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curr=0;
        int total=0;
        int start=0;
        int n=gas.length;
        for(int i=0;i<n;i++){
            curr+=gas[i]-cost[i];
            total+=gas[i]-cost[i];

            if(curr<0){
                start=i+1;
                curr=0;
            }
        }
        return total>=0 ? start : -1;
    }
}