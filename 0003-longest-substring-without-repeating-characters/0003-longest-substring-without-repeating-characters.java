class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int res=0;

        int left=0;
        int right=0;

        for(int i=right; i<s.length(); i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(i));
            right++;

            res= Math.max(res, right-left);
        }

        return res;
    }
}