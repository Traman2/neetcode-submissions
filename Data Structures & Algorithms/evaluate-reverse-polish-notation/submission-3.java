class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> answer = new Stack<>();

        for(String token : tokens){
            //Solve and push
            switch(token){
                case "+":
                    answer.push(answer.pop() + answer.pop());
                    break;
                case "*":
                    answer.push(answer.pop() * answer.pop());
                    break;
                case "-":{
                    int x = answer.pop();
                    int y = answer.pop();
                    answer.push(y - x);
                    break;
                }
                case "/":{
                    int x = answer.pop();
                    int y = answer.pop();
                    answer.push(y / x);
                    break;
                }
                default:
                    answer.push(Integer.parseInt(token));
            }
            
        }

        return answer.peek();
    }
}
