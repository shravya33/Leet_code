class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int count=0;
        int child =0;
        for (int j=0; j<s.length; j++){
            if (child<g.length && g[child]<=s[j]){
                count++;
                child++;
            }
        }

        return count;
    }
}