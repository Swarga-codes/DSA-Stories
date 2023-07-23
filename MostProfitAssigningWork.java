public class MostProfitAssigningWork {
    public static void main(String[] args) {
        int[] difficulty = {85,47,57}, profit = {24,66,99}, worker = {40,25,25};
        System.out.println(maxProfitAssignment(difficulty, profit, worker));
    }
    public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int s=0;
        for(int i=0;i<worker.length;i++){
            s+=find(difficulty,worker[i],profit);
        }
        return s;
    }
    public static int find(int[] difficulty,int potential,int[] profit){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<profit.length;i++){
            if(max<profit[i] && difficulty[i]<=potential){
                max=profit[i];
            }
        }
        if(max==Integer.MIN_VALUE){
            return 0;
        }
        return max;
    }
}
