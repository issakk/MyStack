package Mystack;

public class Demo
{
    public static void main(String[] args)
    {
        MyStack myStack = new MyStack();
        for (int i = 0; i < 30; i++) {
            myStack.add(i);
        }
        System.out.println("myStack.capacity = " + myStack.capacity);
        System.out.println("myStack.currentIndex = " + myStack.currentIndex);
        System.out.println("myStack = " + myStack);
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.capacity = " + myStack.capacity);
        System.out.println("myStack.currentIndex = " + myStack.currentIndex);
        System.out.println("myStack = " + myStack);
    }
}
