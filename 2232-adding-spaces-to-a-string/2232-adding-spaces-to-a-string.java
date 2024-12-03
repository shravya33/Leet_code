class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder result = new StringBuilder();

        int start=0;
        
        for(int space:spaces){
            result.append(s, start, space).append(" ");
            start=space;
        }

        result.append(s.substring(start));
        return result.toString();
    }
}