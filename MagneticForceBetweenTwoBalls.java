import java.util.*;
public class MagneticForceBetweenTwoBalls {
    public static void main(String[] args) {
        int[] position = {1,2,3,4,7}; 
        int m = 3;
        System.out.println(maxDistance(position, m));
    }
    public static int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l=1,h=position[position.length-1]-position[0],mid,ans=-1;
        while(l<=h){
          mid=(l+h)/2;
          if(isPossible(position,m,mid)){
              ans=mid;
              l=mid+1;
          }
          else{
              h=mid-1;
          }
        }
        return ans;
      }
      public static boolean isPossible(int[] position,int m,int possible){
          int k=1;
          int prevPos=position[0];
          for(int i=1;i<position.length;i++){
              int curr=position[i];
              if(curr-prevPos>=possible){
                  k++;
                  prevPos=curr;
              }
              if(k==m){
                  break;
              }
          }
          return k==m;
      }
}
