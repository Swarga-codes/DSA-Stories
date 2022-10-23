package Collections;
public class Enums{
    enum Week implements A{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        Week(){
            System.out.println("This is the constructor for "+this);
        }
        //It prints all the days since this is only private or default not public or protected and as we all
        //know enums consists of variables and objects that cannot be changed or modified.
        @Override
        public void Hello() {
            // TODO Auto-generated method stub
            System.out.println("Hey how are you?");
        }    
    }
    public static void main(String[] args) {
        Week week;
        week=Week.Tuesday;
        week.Hello();
        System.out.println(week);
        System.out.println(week.valueOf("Wednesday"));
        System.out.println(week.ordinal());
for(Week w:Week.values()){
    System.out.println(w);
}
    }
   
 
}
