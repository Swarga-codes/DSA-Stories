public class DetermineIfTwoEventsHaveConflict {
    public static void main(String[] args) {
    String[] event1 = {"01:15","02:00"}, event2 = {"02:00","03:00"};
    System.out.println(haveConflict(event1, event2));
    }
     public static boolean haveConflict(String[] event1, String[] event2) {
     float e11=Integer.parseInt(event1[0].substring(0,2))+(float)Integer.parseInt(event1[0].substring(3,5))/100;
     float e12=Integer.parseInt(event1[1].substring(0,2))+(float)Integer.parseInt(event1[1].substring(3,5))/100;
      float e21=Integer.parseInt(event2[0].substring(0,2))+(float)Integer.parseInt(event2[0].substring(3,5))/100;
       float e22=Integer.parseInt(event2[1].substring(0,2))+(float)Integer.parseInt(event2[1].substring(3,5))/100;
       if((e11<e21 && e12<e21) || (e11>e22 && e12>e22)){
           return false;
       }
       return true;
    }
}
