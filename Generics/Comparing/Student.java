package Generics.Comparing;

public class Student implements Comparable<Student>{
    public int rollno;
    public float marks;
    public Student(int rollno,Float marks){
        this.rollno=rollno;
        this.marks=marks;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return marks+" "+rollno;
    }
    @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
        int diff=(int)(this.marks-o.marks);
        return diff;
    }
}
