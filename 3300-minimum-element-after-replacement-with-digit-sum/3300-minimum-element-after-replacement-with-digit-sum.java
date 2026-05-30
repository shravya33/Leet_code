class Solution {
    public int sumofdigits(int n){
        int sum=0;
        int rem=0;
        while(n>0){
            rem=n%10;
            sum+=rem;
            n=n/10;
        }

        return sum;
    }

    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            min= Math.min(min, sumofdigits(nums[i]));
        }

        return min;
    }
}