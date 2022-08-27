public class Triangle2 {
    public static void main(String[] args) {
        Triangle(5, 0);
    }
    static void Triangle(int r,int c){
         if(r==0){
            return;
         }
         if(c<r){
            Triangle(r, c+1);
            System.out.print("* ");
         }
         else{
            Triangle(r-1, 0);
            System.out.println();
         }
    }
}
