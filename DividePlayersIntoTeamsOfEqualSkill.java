import java.util.Arrays;

public class DividePlayersIntoTeamsOfEqualSkill {
    public static void main(String[] args) {
        int[] skill={3,2,5,1,3,4};
        System.out.println(dividePlayers(skill));

    }
    public static long dividePlayers(int[] skill) {
        int sum=0;
        for(int i=0;i<skill.length;i++){
            sum+=skill[i];
        }
        int target=sum/(skill.length/2);
        if(sum%(skill.length/2)!=0){
            return -1;
        }
        Arrays.sort(skill);
        int i=0,j=skill.length-1;
        long res=0;
        int k=0;
        while(i<j){
            if(skill[i]+skill[j]==target){
                res=res+skill[i]*skill[j];
                i++;
                j--;
                k++;
            }
            else{
                break;
            }
        }
        return k==skill.length/2?res:-1;
    }
}
