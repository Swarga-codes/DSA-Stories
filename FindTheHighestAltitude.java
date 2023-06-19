public class FindTheHighestAltitude {
    public static void main(String[] args) {
        int[] gain={-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        int[] res=new int[gain.length+1];
        res[0]=0;
        for(int i=1;i<res.length;i++){
            res[i]=res[i-1]+gain[i-1];
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<res.length;i++){
            max=Math.max(max,res[i]);
        }
        return max;
    }
}
