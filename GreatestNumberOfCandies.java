import java.util.*;
public class GreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies={2,3,5,1,3};
        int extraCandies=3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if((candies[i]+extraCandies)>=max(candies)){
                res.add(true);
            }
            else{
                res.add(false);
            }
        }
        return res;
    }
    public static int max(int[] candies){
        int m=candies[0];
        for(int i=0;i<candies.length;i++){
            if(m<candies[i]){
                m=candies[i];
            }
        }
        return m;
    }
}
