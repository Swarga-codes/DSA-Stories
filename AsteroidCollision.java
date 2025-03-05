import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] asteroids={-1,1,2,-1};
        System.out.println(Arrays.toString(asteroidCollision(asteroids)));
    }
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<asteroids.length;i++){
            if(!st.isEmpty() && asteroids[i]<0 && st.peek()>0){
                if(Math.abs(asteroids[i])==Math.abs(st.peek())){
                    st.pop();
                    ls.remove(ls.size()-1);
                }
                else{
                    boolean isBlast=false;
                    while(!st.isEmpty() && st.peek()>0 && asteroids[i]<0){
                        if(Math.abs(st.peek())<Math.abs(asteroids[i])){
                            st.pop();
                            ls.remove(ls.size()-1);
                        }
                        else if(Math.abs(st.peek())==Math.abs(asteroids[i])){
                            st.pop();
                            ls.remove(ls.size()-1);
                            isBlast=true;
                            break;
                        }
                        else{
                            break;
                        }
                    }
                    if(!isBlast && st.isEmpty()){
                        st.push(asteroids[i]);
                        ls.add(asteroids[i]);
                    }
                    else if(!isBlast && ((ls.get(ls.size()-1)<0 && asteroids[i]<0) || (ls.get(ls.size()-1)>0 && asteroids[i]>0))){
                        st.push(asteroids[i]);
                        ls.add(asteroids[i]);
                    }
                }
            }
            else{
                st.push(asteroids[i]);
                ls.add(asteroids[i]);
            }
        }
        int[] res=new int[ls.size()];
        for(int i=0;i<res.length;i++){
            res[i]=ls.get(i);
        }
        return res;
    }
}
