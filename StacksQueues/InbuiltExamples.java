package StacksQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InbuiltExamples {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(12);
        stack.push(25);
        stack.push(1);
        stack.push(122);
        stack.push(1);
       System.out.println("Stack:");
        System.out.println(stack.pop());  
        System.out.println(stack.pop());  
        System.out.println(stack.pop());  
        System.out.println(stack.pop());  
        System.out.println(stack.pop());  


        Queue<Integer> queue=new LinkedList<>();
        queue.add(12);
        queue.add(15);
        queue.add(122);
        queue.add(59);
        queue.add(35);
        System.out.println("Queues:");
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
   
        Deque<Integer> deque=new ArrayDeque<>();
        deque.addFirst(12);
        deque.addLast(89);
        deque.addLast(24);
        System.out.println("Deque:");
    System.out.println(deque.removeFirst());
    System.out.println(deque.removeLast());
    }
   

}
