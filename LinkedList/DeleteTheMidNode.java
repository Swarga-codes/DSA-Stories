public class DeleteTheMidNode {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode deleteMiddle(ListNode head) {
        if (head == null) {
            return null;
        }
        int size = 0;
        ListNode tmp = head;
        while (tmp != null) {
            tmp = tmp.next;
            size++;
        }
        if (size == 1) {
            return null;
        }
        if (size == 2) {
            head.next = null;
            return head;
        }
        ListNode node = head;
        for (int i = 1; i <= (size / 2) - 1; i++) {
            node = node.next;
        }
        node.next = node.next.next;
        return head;
    }
}
