class Solution {
    public int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }
    
    public int gcdOfOddEvenSums(int n) {

        int oddsum = n * n;
        int evensum = n * (n + 1);

        return gcd(oddsum,evensum);
        
    }
}