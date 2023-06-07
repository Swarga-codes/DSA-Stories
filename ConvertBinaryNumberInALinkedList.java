public class ConvertBinaryNumberInALinkedList {
    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
    public int getDecimalValue(ListNode head) {
        ListNode tmp=head;
        int size=0;
        while(tmp!=null){
            size++;
            tmp=tmp.next;
        }
        ListNode temp=head;
        int num=0;
        while(temp!=null){
            num+=(int)temp.val*Math.pow(2,--size);
            temp=temp.next;
        }
        return num;
    }
}
