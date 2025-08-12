class Solution {
    public boolean isPalindrome(String s) {
        String ns = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(ns);
        int i=0;
        int j= ns.length()-1;
        while(i<j){
            if(ns.charAt(i) != ns.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}