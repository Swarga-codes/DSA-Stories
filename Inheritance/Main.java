package Inheritance;

public class Main {
    public static void main(String[] args) {
        // Box box=new Box(2.0,3.5,6.77);
        // Box box2=new Box(box);
        // System.out.println(box2.h+" "+" "+box2.w);
        BoxPrice box=new BoxPrice(5,8,200);
        Box box2=new Box(5,8,200);
        System.out.println(box instanceof BoxPrice);
        System.out.println(box instanceof Object);
        System.out.println(box2 instanceof BoxPrice);
    }
}
