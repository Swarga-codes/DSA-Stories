
public class TrappingRainwater {
    public static void main(String[] args) {
        int[] height={4,2,0,2,5};
        System.out.println(trap(height));
    }
    public static int trap(int[] height) {
        int n=height.length;
        int[] prefix=new int[n];
        int[] suffix=new int[n];
        prefix[0]=height[0];
        suffix[n-1]=height[n-1];
        for(int i=1;i<n;i++){
            prefix[i]=Math.max(prefix[i-1],height[i]);
        }
        for(int i=n-2;i>=0;i--){
            suffix[i]=Math.max(suffix[i+1],height[i]);
        }
        
        int res=0;
        for(int i=0;i<n;i++){
            int curr=height[i];
            if(curr<prefix[i] && curr<suffix[i]){
                res+=Math.min(prefix[i],suffix[i])-curr;
            }
        }
        return res;
    }
}
