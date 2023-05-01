public class AverageSalaryExcludingMinimum {
    public static void main(String[] args) {
        int[] salary={1000,5000,4000,2000};
System.out.println(average(salary));
    }
    public static double average(int[] salary) {
        int sum=0;
        if(salary.length<=2){
            return 0;
        }
        for(int i=0;i<salary.length;i++){
            if(salary[i]==max(salary) || salary[i]==min(salary)){
                continue;
            }else{
            sum+=salary[i];
            }
        }
        return ((double)sum/(salary.length-2));
    }
    public static int max(int[] salary){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<salary.length;i++){
            if(max<salary[i]){
                max=salary[i];
            }
        }
        return max;
    }
        public static int min(int[] salary){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<salary.length;i++){
            if(min>salary[i]){
                min=salary[i];
            }
        }
        return min;
    }
}
