public class AlternatingGroups2 {
    public static void main(String[] args) {
        int[] colors={1,0,1,0};
        int k=1;
        System.out.println(numberOfAlternatingGroups(colors, k));
    }
    public static int numberOfAlternatingGroups(int[] colors, int k) {
        int res=0,cnt=1;
        for(int i=1;i<colors.length+k-1;i++){
            if(colors[i%colors.length]==colors[(i-1)%colors.length]){
                cnt=1;
            }
            else{
                cnt++;
                if(cnt>=k) res++;
            }
        }
        return res;
    }
}
