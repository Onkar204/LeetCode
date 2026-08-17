import java.util.*;

public class MinStack {

    static class MinStack {

        Stack<Integer> stack;
        Stack<Integer> minStack;

        public MinStack() {
            stack = new Stack<>();
            minStack = new Stack<>();
        }

        public void push(int value) {

            stack.push(value);

            if (minStack.isEmpty()) {
                minStack.push(value);
            } else {
                int min = Math.min(value, minStack.peek());
                minStack.push(min);
            }
        }

        public void pop() {
            stack.pop();
            minStack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }

    public static void main(String[] args) {

        MinStack minStack = new MinStack();

        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        System.out.println("Minimum: " + minStack.getMin());

        minStack.pop();

        System.out.println("Top: " + minStack.top());
        System.out.println("Minimum: " + minStack.getMin());
    }
}