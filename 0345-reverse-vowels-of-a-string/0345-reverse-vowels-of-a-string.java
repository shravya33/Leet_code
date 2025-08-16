class Solution {
    boolean isVowel(char c) {
            c = Character.toLowerCase(c);
            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
        }
    
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int i=0;
        int j = s.length()-1;


        while(i<j){
            if (!isVowel(ch[i])){
                i++;
            }
            else if (!isVowel(ch[j])){
                j--;
            }
            else if (isVowel(ch[i]) && isVowel(ch[j])){
                char temp= ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }
        }
        return new String(ch);
    }
}