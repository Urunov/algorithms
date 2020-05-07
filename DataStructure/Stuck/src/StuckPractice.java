import java.util.Stack;

/**
 * @Created 07 / 05 / 2020 - 5:06 PM
 * @project StuckPractice
 * @Author Hamdamboy
 */
public class StuckPractice {

    static void stack_push(Stack<Integer> stack) {
        for(int i=0; i<5; i++){
            stack.push(i);
        }
    }

    // Popping element from the top of the stack
    static void stack_pop(Stack<Integer> stack){
        System.out.println("Pop: ");

        for(int i=0; i <5; i++){
            Integer y = stack.pop();
            System.out.println(y);
        }
    }

    //Displaying element on the top of the stack
    static void stack_peek(Stack<Integer> stack){
        Integer element = stack.peek();
        System.out.println("Element on stack top: "+ element);
    }

    // Searching element in the stack
    static void stack_search(Stack<Integer> stack, int element){
        Integer pos = stack.search(element);

        if(pos == -1) {
            System.out.println("Element not found");
        } else{
            System.out.println("Element is found at position");
        }
    }

    public static void main(String []args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack_push(stack);
        stack_pop(stack);

        stack_push(stack);
        stack_peek(stack);

        stack_search(stack, 2);
        stack_search(stack, 6);
    }


}
/****
 *  Stuck is data structure
 *  add -> push
 *  delete - > pop
 *  find -> peek
 *  top -> finding last element in the stack
 *  LIFO (last input first output)
 *
 *  Overflow
 *  underflow (not any element in stack, when you strive to push...)
 * */