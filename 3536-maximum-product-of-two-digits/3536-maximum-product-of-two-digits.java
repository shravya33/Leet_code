class Solution {
    public int maxProduct(int n) {
        int[] digits = String.valueOf(n).chars().map(c->c-'0').toArray();

        Arrays.sort(digits);
        
        return digits[digits.length-1] * digits[digits.length-2];

    }
}