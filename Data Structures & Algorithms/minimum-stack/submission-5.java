class MinStack {
    Stack<Integer> array;
    Stack<Integer> minStack;

    public MinStack() {
        array = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        if(minStack.isEmpty() || minStack.peek() >= val) minStack.push(val);
        array.push(val);
    }
    
    public void pop() {
        if(array.isEmpty()) return;
        int top = array.pop();
        if(minStack.peek() == top) minStack.pop();
        
    }
    
    public int top() {
        return array.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
