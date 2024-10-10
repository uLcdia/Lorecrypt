// import java.util.ArrayDeque;
import java.util.ArrayList;

public class Stack {
    /*
    private ArrayDeque<String> stack;

    public Stack() {
        this.stack = new ArrayDeque<>();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void add(String value) {
        stack.push(value);
    }

    public String take() {
        if (!stack.isEmpty()) {
            return stack.pop();
        }
        return null;
    }

    public ArrayList<String> values() {
        return new ArrayList<>(stack);
    }
    */

    private ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void add(String value) {
        stack.add(value);
    }

    public String take() {
        if (!stack.isEmpty()) {
            return stack.remove(stack.size() - 1);
        }
        return null;
    }

    public ArrayList<String> values() {
        return stack;
    }
}
