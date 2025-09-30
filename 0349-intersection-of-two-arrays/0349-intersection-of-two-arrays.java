class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>(); 

        for(int i:nums1){
            set1.add(i);
        }

        for (int i:nums2){
            if (set1.contains(i)){
                list.add(i);
                set1.remove(i);
            }
        }

        int[] ans = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            ans[i] = list.get(i);
        }

        return ans;
    }
}