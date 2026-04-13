import java.util.Stack;

public class Java45 {
    Stack<Integer> stack = new Stack<>();

    void pushElement(int x) {
        stack.push(x);
    }

    void popElement() {
        if (!stack.isEmpty()) {
            System.out.println(stack.pop());
        } else {
            System.out.println("Stack is empty");
        }
    }

    void checkEmpty() {
        System.out.println(stack.isEmpty());
    }

    public static void main(String[] args) {
        Java45 obj = new Java45();
        obj.pushElement(10);
        obj.pushElement(20);
        obj.popElement();
        obj.checkEmpty();
    }
}