import java.util.Arrays;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals={{1,3},{2,4},{5,8},{3,9}};
        System.out.println(Arrays.deepToString(merge(intervals)));
    }
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int i=0,n=intervals.length-1;
        int[][] store=new int[n+1][2];
        int k=0;
        while(i<=n){

            int j=i+1;
            
            int start=intervals[i][0],end=intervals[i][1];
            while(j<=n && end>=intervals[j][0]){
                start=Math.min(start,intervals[j][0]);
                end=Math.max(end,intervals[j][1]);
                j++;
            }
            store[k][0]=start;
            store[k][1]=end;
            k++;
            if(j-i>1){
            i=j;
            }
            else{
                i++;
            }
            

        }
        int[][] res=new int[k][2];
        for(int l=0;l<k;l++){
            res[l][0]=store[l][0];
            res[l][1]=store[l][1];
        }
        return res;

    }   
}
