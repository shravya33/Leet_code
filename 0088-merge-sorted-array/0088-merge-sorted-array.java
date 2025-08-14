class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int[] merged = new int[m+n];
        int idx =0;

        for(int i=0; i<m; i++){
            if (nums1[idx] != 0){
                nums1[idx]=nums1[i];
                idx++;
            }
        }


        for(int i=0; i<n; i++){
            nums1[m+i]= nums2[i];
        }

        Arrays.sort(nums1);
    }
}