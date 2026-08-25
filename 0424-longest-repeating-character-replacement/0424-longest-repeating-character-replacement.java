class Solution {
    public int characterReplacement(String s, int k) {
        int freq[] = new int[26];
        int left =0;
        int ans=0;
        int maxfreq=0;

        for(int right=0; right<s.length(); right++){
            freq[s.charAt(right)-'A']++;
            maxfreq =Math.max(maxfreq, freq[s.charAt(right)-'A']);

            int window = right-left+1;
            int replace = window-maxfreq;

            if(replace >k){
                freq[s.charAt(left)-'A']--;
                left++;
            }

            ans = Math.max(ans, right-left+1);
        }

        return ans;
    }
}