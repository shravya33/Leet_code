class Solution {
    public int longestPalindrome(String s) {
        int[] array = new int[58];
        int count=0;
        int odd=0;

        for (char each : s.toCharArray()){
            array[each - 'A']++;
        }

        for(int each : array){
            if(each%2==0 && each!=0){
                count+=each;
            }
            else if(each%2==1 && each!=1){
                count+=each-1;
                odd=1;
            }
            else if(each==1){
                odd=1;
            }
        }

        return count+odd;
    }
}