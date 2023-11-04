public class LastMomentBeforeAllAntsFallOutOfAPlank {
    public static void main(String[] args) {
        int[] left={4,3},right={0,1};
        int n=4;
        System.out.println(getLastMoment(n, left, right)); 
    }
    public static int getLastMoment(int n, int[] left, int[] right) {
        int res=0;
        for(int i=0;i<left.length;i++){
            res=(int) Math.max(left[i],res);
        }
         for(int i=0;i<right.length;i++){
            res=(int) Math.max(n-right[i],res);
        }
        return res;
    }
}
