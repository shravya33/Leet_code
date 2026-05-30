class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;

        for (char ch = 'a'; ch <= 'z'; ch++) {
            int lastLower = -1;
            int firstUpper = -1;

            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == ch) {
                    lastLower = i;
                }

                if (word.charAt(i) == Character.toUpperCase(ch) && firstUpper == -1) {
                    firstUpper = i;
                }
            }

            if (lastLower != -1 && firstUpper != -1 && lastLower < firstUpper) {
                count++;
            }
        }

        return count;
    }
}