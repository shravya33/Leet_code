class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
     List<Integer> beforepivot = new ArrayList<>();  
     List<Integer> equalpivot = new ArrayList<>();
     List<Integer> afterpivot= new ArrayList<>();

     for(int i=0; i<nums.length; i++){
        if(nums[i]<pivot){
            beforepivot.add(nums[i]);
        }
        else if(nums[i]==pivot){
            equalpivot.add(nums[i]);
        }
        else if(nums[i]>pivot){
            afterpivot.add(nums[i]);
        }
     }

     beforepivot.addAll(equalpivot);
     beforepivot.addAll(afterpivot);

     int[] ans = beforepivot.stream().mapToInt(x->x).toArray();

     return ans;
    }
}