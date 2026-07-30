class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> answer = new Stack<>();
        int x = 0;
        int y = 0;
        for(String token : tokens){
            switch(token){
                case "+":
                    answer.push(String.valueOf(Integer.parseInt(answer.pop()) + Integer.parseInt(answer.pop())));
                    break;
                case "-":
                    x = Integer.parseInt(answer.pop());
                    y = Integer.parseInt(answer.pop());
                    answer.push(String.valueOf(y - x));
                    break;
                case "*":
                    answer.push(String.valueOf(Integer.parseInt(answer.pop()) * Integer.parseInt(answer.pop())));
                    break;
                case "/":
                    x = Integer.parseInt(answer.pop());
                    y = Integer.parseInt(answer.pop());
                    answer.push(String.valueOf(y / x));
                    break;
                default:
                    answer.push(token);
            }
        }


        return Integer.parseInt(answer.peek());
    }
}
