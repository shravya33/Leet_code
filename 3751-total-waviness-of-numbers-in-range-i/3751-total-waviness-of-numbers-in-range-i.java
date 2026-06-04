class Solution {
    public int totalWaviness(int num1, int num2) {

        int peak=0;
        int valley=0;

        for(int i=num1; i<=num2; i++){
            String s = Integer.toString(i);
            for(int n=1; n<s.length()-1; n++){
                if(s.charAt(n-1)<s.charAt(n) && s.charAt(n)>s.charAt(n+1)){
                    peak++;
                }
                else if(s.charAt(n-1)>s.charAt(n) && s.charAt(n)<s.charAt(n+1)){
                    valley++;
                }
            }
        }

        return peak+valley;
    }
}