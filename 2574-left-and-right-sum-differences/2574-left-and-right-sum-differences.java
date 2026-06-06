class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ans= new int[nums.length];

        int totalsum=0;
        for(int n:nums){
            totalsum+=n;
        }

        int leftsum=0;
        for(int i=0; i<nums.length; i++){
            totalsum-=nums[i];
            ans[i] = Math.abs(leftsum-totalsum);
            leftsum+=nums[i];
        }

        return ans;
    }
}