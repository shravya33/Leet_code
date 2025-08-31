class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxwater=0;

        while(left<right){
            int h= Math.min(height[left], height[right]);
            int w = Math.abs(left-right);
            int water =h*w;
            maxwater=Math.max(maxwater,water);

            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }

        return maxwater;
    }
}