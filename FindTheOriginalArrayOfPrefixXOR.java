import java.util.Arrays;

public class FindTheOriginalArrayOfPrefixXOR {
    public static void main(String[] args) {
        int[] pref={5,2,0,3,1};
        System.out.println(Arrays.toString(findArray(pref)));
    }
    public static int[] findArray(int[] pref) {
        int prev=pref[0];
        for(int i=1;i<pref.length;i++){
            int tmp=pref[i];
            pref[i]^=prev;
            prev=tmp;
        }
        return pref;
    }
}
