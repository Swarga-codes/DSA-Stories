import java.util.Collections;
import java.util.PriorityQueue;

public class FindMedianFromDataStream {
     PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;
    public FindMedianFromDataStream() {
        minHeap=new PriorityQueue<>();
        maxHeap=new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        if(maxHeap.isEmpty() || num<=maxHeap.peek()){
            maxHeap.add(num);
        }
        else{
             minHeap.add(num);
        }
        if(maxHeap.size()>minHeap.size()+1){
            int el=maxHeap.poll();
            minHeap.add(el);
        }
        else if(minHeap.size()>maxHeap.size()){
            int el=minHeap.poll();
            maxHeap.add(el);
        }
        

    }
    
    public double findMedian() {
         int sum=maxHeap.size()+minHeap.size();
         return (double)(sum%2!=0?maxHeap.peek():(double)(maxHeap.peek()+minHeap.peek())/2);
    }
}
