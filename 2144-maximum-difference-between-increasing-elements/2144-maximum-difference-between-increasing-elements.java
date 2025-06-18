class Solution {
    public int maximumDifference(int[] nums) {
        int max_diff = -1;
        int min = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > min) {
                int new_diff = nums[i] - min;
                if (new_diff > max_diff) {
                    max_diff = new_diff;
                }
            } else {
                min = nums[i];
            }
        }
        
        return max_diff;
    }
}