class Solution {
    public int firstMissingPositive(int[] nums) {
        int n= nums.length;
        int x=1;
        Arrays.sort(nums);

        for (int i=0; i<n; i++){
            if(nums[i]==x){
                x++;
            }
            else if(nums[i]>x){
                break;
            }
        }

        return x;
    }
}