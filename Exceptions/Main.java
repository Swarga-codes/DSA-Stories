package Exceptions;

public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        int c;
  try{
// divide(a, b);
String name="Markus";
if(name.equals("Markus")){
    throw new MyExceptions("Markus is an exception");
    // throw new Exception("just for fun");
}
}catch(MyExceptions e){
    System.out.println(e.getMessage());
}

  catch(ArithmeticException e){
    System.out.println(e.getMessage());
    // System.out.println("First block executed");
  }
  catch(Exception e){
System.out.println("normal exception");
  }finally{
    System.out.println("This will always execute");
  }
    }
    static int divide(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("please do not divide by 0");
        }
        return a/b;
    }
}
