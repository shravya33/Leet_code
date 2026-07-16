class Solution {
    public int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }
    
    public long gcdSum(int[] nums) {
        int[] prefixgcd = new int[nums.length];
        int max =0;

        for(int i=0; i<nums.length; i++){
            max= Math.max(max, nums[i]);
            prefixgcd[i]=gcd(max,nums[i]);
        }

        Arrays.sort(prefixgcd);

        int left=0;
        int right=prefixgcd.length-1;
        long ans=0;
        while(left<right){
            ans+=gcd(prefixgcd[left], prefixgcd[right]);
            left++;
            right--;
        }

        return ans;
    }
}