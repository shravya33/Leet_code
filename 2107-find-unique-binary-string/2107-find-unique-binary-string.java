class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder answer = new StringBuilder();
        for (int i=0; i<nums.length; i++) {
            if (nums[i].charAt(i) == '1') {
                answer.append('0');
            } else {
                answer.append('1');
            }
        }
        return answer.toString();
    }
}