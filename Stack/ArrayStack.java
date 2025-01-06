package Stack;
class MyStack {
final int size = 10;
int arr[] = new int [size];
int top = -1;
int peek(){
    if (isEmpty()) {
        System.err.println("Stack is empty");
        return -1; // Return an invalid value or throw an exception
    }
return arr[top];
}
boolean isEmpty(){
return top == -1;
}
void push(int data){
if(top>=size-1){
    System.out.println("stack overflow");
    return;
}
top = top + 1;
arr[top]=data;
}
int pop(){
    if (this.isEmpty()) {
        System.err.println("Stack is empty");
        return -1;
    }
    int temp = arr[top];
    top = top - 1;
    return temp;
}
}
public class ArrayStack {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        //System.err.println(stack.pop());
        //System.err.println(stack.peek());
        //System.out.println(stack.isEmpty());
        // Test pop and peek on an empty stack
        System.err.println(stack.pop()); // Should print "Stack is empty" and return -1
        System.err.println(stack.peek()); // Should print "Stack is empty" and return -1

        // Check if the stack is empty
        System.out.println(stack.isEmpty()); // Should return true
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        // Attempt to push beyond stack capacity
        stack.push(11); // Should print "Stack overflow"

        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
    }
}
