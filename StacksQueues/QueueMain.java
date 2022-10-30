package StacksQueues;

public class QueueMain {
    public static void main(String[] args) throws Exception{
    //     CustomQueue cqueue=new CustomQueue(5);
    //     cqueue.insert(1);
    //     cqueue.insert(3);
    //     cqueue.insert(9);
    //     cqueue.insert(7);
    //     cqueue.insert(2);
    //     cqueue.remove();
    //     System.out.println(cqueue.front());
    //    cqueue.display();
       CircularQueues cirQ=new CircularQueues(5);
       cirQ.insert(1);
       cirQ.insert(3);
       cirQ.insert(9);
       cirQ.insert(7);
       cirQ.insert(2);
       cirQ.display();
       System.out.println(cirQ.remove());
       cirQ.insert(133);
       cirQ.display();
    }
}
