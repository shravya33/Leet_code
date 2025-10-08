class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] ans = new int[spells.length];

        Arrays.sort(potions);
        
        for(int i=0; i<spells.length; i++){
            int low = 0;
            int high = potions.length;
            long spell = spells[i];
            while(low<high){
                int mid = (low+high)/2;
                if(spell*potions[mid]>=success){
                    high=mid;
                }
                else{
                    low = mid+1;
                }
            }
            ans[i]=potions.length-low;
        }

        return ans;
    }
}