public class FindTheHighestAltitude {
    public static void main(String[] args) {
        int[] gain={-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        int max=gain[0];
        for(int i=1;i<gain.length;i++){
            gain[i]=gain[i]+gain[i-1];
            if(max<gain[i]){
                max=gain[i];
            }
        }
        return max<0?0:max;
    }
}
