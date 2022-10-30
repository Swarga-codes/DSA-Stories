package StacksQueues;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    public int ptr=-1;
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
    this.data=new int[size];
    }
    public boolean push(int val){
        if(isFull()){
            System.out.println("Stack is full!");
        return false;
        }
        ptr++;
        data[ptr]=val;
        return true;
    }
    public int pop() throws Exception{
        if(isEmpty()){
          throw new Exception("Cannot pop from an empty stack!!");
        }
        return data[ptr--];
    }
    public boolean isFull(){
        return ptr==data.length-1;
    }
    public boolean isEmpty(){
        return ptr==-1;
    }
}
