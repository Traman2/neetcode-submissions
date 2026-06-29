class Solution {
    public boolean isValid(String s) {
        char[] values = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(char value : values){
            switch(value){
                case '}':
                    if(stack.isEmpty()) return false;
                    if(stack.pop() != '{') return false;
                    break;
                case ')':
                    if(stack.isEmpty()) return false;
                    if(stack.pop() != '(') return false;
                    break;
                case ']':
                    if(stack.isEmpty()) return false;
                    if(stack.pop() != '[') return false;
                    break;
                default:
                    stack.push(value);
            }

        }

        return stack.isEmpty();
    }
}
