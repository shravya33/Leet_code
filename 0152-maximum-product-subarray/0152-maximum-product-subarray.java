class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int currmax=nums[0];
        int currmin=nums[0];
        int product=nums[0];

        for (int i=1; i<n; i++){
            int tempmax = Math.max(nums[i], Math.max(nums[i]*currmax, nums[i]*currmin));
            int tempmin = Math.min(nums[i], Math.min(nums[i]*currmax, nums[i]*currmin));
            currmax = tempmax;
            currmin = tempmin;

            product = Math.max(product, currmax);
        }

        return product;
    }
}

