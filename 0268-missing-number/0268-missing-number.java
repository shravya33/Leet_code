class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int count=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]!= count){
                return count;
            }
            count++;
        }

        return count;
    }
}