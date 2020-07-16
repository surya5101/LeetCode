class MinStack {
Stack<Integer>s=new Stack();
Stack<Integer>s1=new Stack();    
    /** initialize your data structure here. */
     public MinStack() {
    }
    public void push(int x) {
        if(s1.isEmpty()||x<=s1.peek())
        {
            s1.push(x);
        }s.push(x);
    }
    
    public void pop() {
        if(s.peek().equals(s1.peek())){s1.pop();}
        s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return s1.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
