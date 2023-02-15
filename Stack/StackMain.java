//complexity o(1)
package Stack;
public class StackMain {
    public static void main(String[] args) throws StackException {
        // CustomStack stack=new CustomStack(5);
        DynamicStack stack=new DynamicStack(5);
        // CustomStack stack=new DynamicStack(5); //parent can use as type also
        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);
        stack.push(17);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        // System.out.println(stack.pop());
    }
}
