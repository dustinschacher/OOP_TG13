package B1_Lists;
import java.util.Stack;
public class StackBeispiel {
    public static void main(String[] args) {
        //LIFO
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
