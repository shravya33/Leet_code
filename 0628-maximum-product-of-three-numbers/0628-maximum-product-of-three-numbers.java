class Solution {
    public int maximumProduct(int[] nums) {
        boolean haspositive=false;
        boolean hasnegative=false;
        
        for(int n: nums){
            if(n>0){
                haspositive=true;
            }
            else if(n<0){
                hasnegative=true;
            }
        }

        if(haspositive && hasnegative){
            Arrays.sort(nums);
            return Math.max(nums[0]*nums[1]*nums[nums.length-1], 
                            nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]) ;
        } 
        else if(haspositive){
            Arrays.sort(nums);
            return nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        }
        else if(hasnegative){
            Arrays.sort(nums);
            return nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        }

    return 0;
    }
}