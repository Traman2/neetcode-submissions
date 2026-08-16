class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        HashMap<Character, Character> closingMap = new HashMap<>();
        closingMap.put(']', '[');
        closingMap.put('}', '{');
        closingMap.put(')', '(');

        for(char sChar : s.toCharArray()){
            if(closingMap.containsKey(sChar) && !stack.isEmpty()) {
                if(closingMap.get(sChar) == stack.peek()){
                    stack.pop();
                }
                else return false;
            }
            else stack.push(sChar);
        }

        return stack.isEmpty();
    }
}
