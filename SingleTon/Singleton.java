package SingleTon;

public class Singleton {
 private Singleton(){

 }
    private static Singleton instance;
    public static Singleton isInstance(){
        if(instance==null){
            Singleton obj=new Singleton();
        }
        return instance;
    }
}
