import java.util.*;
class TaskScheduler{
public static void main(String[] args) {
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 2;
        System.out.println(leastInterval(tasks, n));
}
    public static int leastInterval(char[] tasks, int n) {
     int[] freq=new int[26];
     for(int i=0;i<tasks.length;i++){
        freq[tasks[i]-'A']++;
     }
     Arrays.sort(freq);
     int maxFreq=freq[25]-1;
     int idle=maxFreq*n;
     for(int i=24;i>=0;i--){
        idle-=Math.min(freq[i],maxFreq);
     }
     return idle>0?idle+tasks.length:tasks.length;

    }
}