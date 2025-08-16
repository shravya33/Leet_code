class Solution {
    public int maximum69Number (int num) {
        String str = Integer.toString(num);
        char[] s = str.toCharArray();

        for (int i=0; i<str.length(); i++){
            if(s[i]=='6'){
                s[i]='9';
                break;
            }
        }

        return Integer.parseInt(new String(s));
    }
}