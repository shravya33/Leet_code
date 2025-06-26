class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        
        int maxsum=nums[0];
        int currmax=0;
        
        for (int i=0; i<n; i++){
            currmax = Math.max(nums[i], currmax+nums[i]);
            maxsum = Math.max(currmax, maxsum);
        }
        
        return maxsum;
    }
}
 