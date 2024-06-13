import java.util.Arrays;

public class MinimumNumberOfMovesToSeatEveryone {
    public static void main(String[] args) {
        int[] seats = {3,1,5}, students = {2,7,4};
        System.out.println(minMovesToSeat(seats, students));
    }
    public static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int ans=0;
        for(int i=0;i<seats.length;i++){
            ans+=Math.abs(seats[i]-students[i]);
        }
        return ans;
    }
}
