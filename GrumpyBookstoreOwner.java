public class GrumpyBookstoreOwner {
    public static void main(String[] args) {
        int[] customers = {1,0,1,2,1,1,7,5}, grumpy = {0,1,0,1,0,1,0,1};
        int minutes = 3;
        System.out.println(maxSatisfied(customers, grumpy, minutes));
    }
    public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int nonGrumpySum=0;
      for(int i=0;i<grumpy.length;i++){
        if(grumpy[i]==0){
            nonGrumpySum+=customers[i];
        }
      }
        int maxGrumpySum=0,grumpySum=0;
        for(int i=0;i<customers.length;i++){
            if(grumpy[i]==1){
                grumpySum+=customers[i];
            }
            if(i>=minutes && grumpy[i-minutes]==1){
                grumpySum-=customers[i-minutes];
            }
            maxGrumpySum=Math.max(maxGrumpySum,grumpySum);
        }
        return nonGrumpySum+maxGrumpySum;
    }
}
