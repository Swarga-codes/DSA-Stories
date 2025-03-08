public class MinimumRecolorsToGetKConsecutiveBlackBlocks {
    public static void main(String[] args) {
        String blocks="WWBBBBB";
        int k=5;
        System.out.println(minimumRecolors(blocks, k));
    }
    public static int minimumRecolors(String blocks, int k) {
        int black=0,res=0;
        for(int i=0;i<k;i++){
         if(blocks.charAt(i)=='B'){
             black++;
         }
        }
        res=k-black;
        if(res==0) return res;
        for(int i=1;i<blocks.length()-k+1;i++){
         if(blocks.charAt(i-1)=='B'){
             black--;
         }
         if(blocks.charAt(k+i-1)=='B'){
             black++;
             res=Math.min(res,k-black);
         }
        }
        return res; 
     }
}
