class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        
        for (int n: nums){
            set.add(n);
        }
        
        int multiple=k;

        while (true) {
            if (!set.contains(multiple)){
                return multiple;
            } 
            else{
                multiple += k;
            }
        }
    }
}