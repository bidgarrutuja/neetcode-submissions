class MinStack {
    Stack<Long> stack;
    long min;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        long x = val;

        if (stack.isEmpty()) {
            stack.push(x);
            min = x;
        } else if (x < min) {
            stack.push(2 * x - min);
            min = x;
        } else {
            stack.push(x);
        }
    }

    public void pop() {
        if (stack.peek() < min) {
            min = 2 * min - stack.peek();
        }
        stack.pop();
    }

    public int top() {
        if (stack.peek() < min) {
            return (int) min;
        }
        return stack.peek().intValue();
    }

    public int getMin() {
        return (int) min;
    }
}