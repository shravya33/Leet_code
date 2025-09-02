class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer> nums = new HashSet<>();

        for(int n : arr){
            nums.add(n);
        }
        
        int n=1;
        int missing = 0;
        
        while(true){
            if(!nums.contains(n)){
                missing++;

                if(missing==k){
                    return n;
                }
            }
            n++;
        }
    }
}