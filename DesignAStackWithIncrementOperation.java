class DesignAStackWithIncrementOperation{
class CustomStack {
    public int maxSize;
    int k=0;
    List<Integer> stack=new ArrayList<>();
    public CustomStack(int maxSize) {
        this.maxSize=maxSize;
    }
    
    public void push(int x) {
        if(maxSize==k){
            return;
        }
stack.add(x);
k++;
    }
    
    public int pop() {
        int tmp=-1;
        if(k==0){
            return tmp;
        }
        tmp=stack.get(k-1);
        stack.remove(k-1);
        k--;
        return tmp;
    }
    
    public void increment(int c, int val) {
        int len=c>stack.size()?stack.size():c;
        for(int i=0;i<len;i++){
            stack.set(i,stack.get(i)+val);
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
}