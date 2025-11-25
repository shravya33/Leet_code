class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> found = new HashSet<>();

        for (int n:nums){
            found.add(n);
        }

        while(found.contains(original)){
            original = original*2;
        }

        return original;
    }
}