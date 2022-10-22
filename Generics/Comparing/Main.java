package Generics.Comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student markus=new Student(34, 94.2f);
        Student wrench=new Student(35, 96f);
        Student sitara=new Student(32, 92.2f);
        Student michael=new Student(22, 96f);
        Student franklin=new Student(11, 94.2f);
        Student trevor=new Student(5, 96f);
        Student[] list={markus,wrench,sitara,michael,franklin,trevor};
        // if(markus.compareTo(wrench)<0){
        //     System.out.println("Wrench has more marks");
        //     System.out.println(markus.compareTo(wrench));
        // }
        System.out.println(Arrays.toString(list));
        // Arrays.sort(list);
        //in ascending order
        Arrays.sort(list, new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                return (int)(o1.marks-o2.marks);
            };
        });
        System.out.println(Arrays.toString(list));
        //in descending order
        Arrays.sort(list, new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                return -(int)(o1.marks-o2.marks);
            };
        });
        
        System.out.println(Arrays.toString(list));
        //lambda expression for the same
        Arrays.sort(list, (o1,o2) -> (int)(o1.marks-o2.marks)
        );
        System.out.println(Arrays.toString(list));
    }
}
