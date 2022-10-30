package StacksQueues;

public class CircularQueues {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    public int front=0;
    public int end=0;
    private int size=0;
    public CircularQueues(){
        this(DEFAULT_SIZE);
    }
    public CircularQueues(int size){
        this.data=new int[size];
    }
    public boolean insert(int val){
        if(isFull()){
            System.out.println("Circular Queue is full!");
            return false;
        }
        data[end++]=val;
        end=end%data.length;
        size++;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("The given Circular Queue is empty!");
        }
        int removed=data[front++];
        front=front%data.length;
        size--;
        return removed;
    }
    public int front()throws Exception{
        if(isEmpty()){
            throw new Exception("The given Circular Queue is empty!");
        }
        return data[front];
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Circular Queue is Empty!");
       return;
        }
int i=front;
do{
    System.out.print(data[i]+"<-");
    i++;
    i=i%data.length;
}while(i!=end);
System.out.println("END");

    }
    public boolean isFull(){
        return size==data.length;
    }
    public boolean isEmpty(){
        return size==0;
    }
}
