class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int compare=m-1;
        int end=n-1;
        int Merge=m+n-1;
        //edge case
        while(compare>=0 && end>=0){
            if(nums1[compare]>nums2[end]){
                nums1[Merge--]=nums1[compare--];
            }else{
                nums1[Merge--]=nums2[end--];
            }
        }
        while(end>=0){
            nums1[Merge--]=nums2[end--];
        }
    }
}