public class TotalDistanceTravelled {
    public static void main(String[] args) {
        int mainTank=9,additionalTank=3;
        System.out.println(distanceTraveled(mainTank, additionalTank));
    }
    public static int distanceTraveled(int mainTank, int additionalTank) {
        int dist=0;
         if(mainTank<5 || (mainTank>5 && additionalTank==0)){
           return mainTank*10;
        }
    while(mainTank!=0){
        if(additionalTank==0 || mainTank<5){
            return dist+mainTank*10;
        }
        else{
       dist=dist+5*10;
       mainTank=mainTank-5+1;
       additionalTank--;
        }
    }
    return dist; 
    }
}
