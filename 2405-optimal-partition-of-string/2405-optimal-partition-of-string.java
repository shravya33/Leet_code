class Solution {
    public int partitionString(String s) {
        int idx=0;
        int count=1;
        HashSet<Character> set = new HashSet<>();

        while(idx<s.length()){
            if(set.contains(s.charAt(idx))){
                count++;
                set.clear();
            }
            set.add(s.charAt(idx));
            idx++;
        }

        return count;
    }
}