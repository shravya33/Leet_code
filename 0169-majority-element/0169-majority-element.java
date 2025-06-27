class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int c = 0;
        int candidate = 0;

        for (int i=0; i<n; i++){
            int num = nums[i];

            if (c==0){
                candidate=num;
            }

            if (num==candidate){
                c++;
            }

            else{
                c--;
            }
        }

        return candidate;
    }
}