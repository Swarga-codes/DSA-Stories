package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(25);
        list.add(35);
        System.out.println("The elements in arraylist are: ");
    System.out.println(list);
    List<Integer> list2=new LinkedList<>();
    list2.add(5);
        list2.add(25);
        list2.add(31);
        System.out.println("The elements in linkedlist are: ");
        System.out.println(list2);
    List<Integer> list3=new Vector<>();
    list3.add(22);
        list3.add(21);
        list3.add(1);
        System.out.println("The elements in vector are: ");
        System.out.println(list3);
    }
}
