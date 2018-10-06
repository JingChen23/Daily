import java.util.Stack;

public class MinStack {

    Stack<Integer> mainStack;
    Stack<Integer> supportStack;

    /**
     * initialize your data structure here.
     */
    public MinStack() {

        mainStack = new Stack<>();
        supportStack = new Stack<>();

    }

    public void push(int x) {
        mainStack.push(x);
        if (supportStack.isEmpty() || x < supportStack.peek()) {
            supportStack.push(x);
        } else {
            supportStack.push(supportStack.peek());
        }
    }

    public void pop() {
        mainStack.pop();
        supportStack.pop();
    }

    public int top() {
        return mainStack.peek();
    }

    public int getMin() {
        return supportStack.peek();
    }


    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(3);
        minStack.push(2);
        minStack.push(4);
        minStack.top();
        System.out.println(minStack.getMin());
        minStack.pop();
        minStack.pop();
        minStack.push(1);
        System.out.println(minStack.getMin());
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