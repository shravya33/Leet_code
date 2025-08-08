class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> par = new HashMap<>();
        par.put(')', '(');
        par.put('}', '{');
        par.put(']', '[');

        for (char c : s.toCharArray()){
            if (par.containsValue(c)){
                stack.push(c);
            }
            else if(par.containsKey(c)){
                if(stack.isEmpty() || par.get(c) != stack.pop()){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}