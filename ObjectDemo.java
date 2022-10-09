public class ObjectDemo {
    int num;
    double num2;
    public ObjectDemo(int n,float x){
        this.num=n;
        this.num2=x;
    }
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return this.num==((ObjectDemo)obj).num;
    }
    public static void main(String[] args) {
        ObjectDemo obj1=new ObjectDemo(34,24.2f);
        // ObjectDemo obj2=obj1;    
        ObjectDemo obj2=new ObjectDemo(34,43.2f);    
        // System.out.println(obj1.hashCode());
        // System.out.println(obj2.hashCode());
        if(obj1==obj2){
            System.out.println("obj1 is equals than obj2");
        }
        if(obj1.equals(obj2)){
            System.out.println("obj1 is equal to obj2");
        }
        System.out.println(obj1.getClass());
        System.out.println(obj1.getClass().getName());
    }
}
