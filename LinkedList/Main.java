package LinkedList;

public class Main {
    public static void main(String[] args) {
    //     SinglyLinkedlist list=new SinglyLinkedlist();
    //     list.insertFirst(3);
    //     list.insertFirst(9);
    //     list.insertFirst(2);
    //     list.insertFirst(5);
    //     list.insertLast(44);
    //     list.insert(100, 3);
    //    System.out.println("The deleted element from first is: "+list.deleteFirst()); 
    //     list.display();
    //     System.out.println();
    //  System.out.println("The deleted element from the last is: "+list.deleteLast());
    //  list.display();
    //  System.out.println();
    //  System.out.println("The deleted element in the required index is: "+list.delete(1));
    //  list.display();
    //  System.out.println();
    //  System.out.println(list.find(100));
    
    DoublyLinkedList list2=new DoublyLinkedList();
    list2.insertFirst(3);
    list2.insertFirst(9);
    list2.insertFirst(2);
    list2.insertFirst(5);
    list2.insertLast(99);
    list2.insertAfter(9, 10);
    list2.display();
    // CircularLinkedlist list3=new CircularLinkedlist();
    // list3.insert(3);
    // list3.insert(9);
    // list3.insert(2);
    // list3.insert(5);
    // list3.delete(9);
    // list3.display();
}
}