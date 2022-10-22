package Cloning;

public class Human implements Cloneable{
    public int age;
    public String name;
    public int[] arr;
    public Human(int age,String name){
        this.age=age;
        this.name=name;
        this.arr=new int[]{2,3,4,5,6};
    }
    //this is a shallow copy made
    // @Override
    // protected Object clone() throws CloneNotSupportedException {
    //     // TODO Auto-generated method stub
    //     return super.clone();
    // }
    //this is the code for deep copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
       Human twin=(Human)super.clone();
      twin.arr=new int[twin.arr.length];
      for (int i = 0; i < twin.arr.length; i++) {
        twin.arr[i]=arr[i];
      }
      return twin;
    }

}
