class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int str1_length = str1.length();
        int str2_length = str2.length();
        char str2_char = str2.charAt(0);

        int str1_index = 0;
        int str2_index = 0;
        while (str1_index<str1_length && str2_index<str2_length){
            char str1_char = str1.charAt(str1_index);

            if(str1_char == str2_char || (char)(str1_char+1) == str2_char || (str1_char =='z' && str2_char=='a')){
                str2_index++;

                if(str2_index < str2_length){
                    str2_char = str2.charAt(str2_index);
                }
            }

            str1_index++;
        }

        return str2_index == str2_length;
    }
}