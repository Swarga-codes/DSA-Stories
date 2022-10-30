package StacksQueues;

public class StackMain {
    public static void main(String[] args) throws Exception{
        // For Custom stack
        // CustomStack stack=new CustomStack(5);
        // stack.push(1);
        // stack.push(3);
        // stack.push(9);
        // stack.push(7);
        // stack.push(2);
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
    //for dynamic stack
    DynamicStack dstack=new DynamicStack();
    dstack.push(1);
    dstack.push(3);
    dstack.push(9);
    dstack.push(7);
    dstack.push(2);
    dstack.push(55);
    System.out.println(dstack.pop());
    System.out.println(dstack.pop());
    System.out.println(dstack.pop());
    System.out.println(dstack.pop());
    System.out.println(dstack.pop());
    System.out.println(dstack.pop());
    }
}
