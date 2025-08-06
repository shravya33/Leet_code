class Solution {
    public int reverse(int x) {
        int digit = 0;
        int rev = 0;
        int neg = 0;

        if (x < 0) {
            x = Math.abs(x);
            neg++;
        }

        while (x > 0) {
            digit = x % 10;
            if (rev > (Integer.MAX_VALUE - digit) / 10) {
                return 0;
            }
            rev = rev * 10 + digit;
            x = x / 10;
        }

        if (neg == 1) {
            rev = -rev;
        }

        return rev;
    }
}
