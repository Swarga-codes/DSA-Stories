import java.util.HashSet;
import java.util.Set;

public class LetterTilePossibilities {
    public static void main(String[] args) {
        String tiles="AAB";
        System.out.println(numTilePossibilities(tiles));
    }
    public static int numTilePossibilities(String tiles) {
        StringBuilder sb=new StringBuilder();
        boolean[] visited=new boolean[tiles.length()];
        Set<String> set=new HashSet<>();
        for(int i=1;i<=tiles.length();i++){
        getPermute(tiles,sb,i,visited,set);
        }
        return set.size();
    }
    public static void getPermute(String tiles,StringBuilder sb,int idx,boolean[] visited,Set<String> set){
        if(idx==sb.length()){
            set.add(sb.toString());
                return;
            }
        for(int i=0;i<tiles.length();i++){
            if(visited[i]==false){
                visited[i]=true;
                sb.append(tiles.charAt(i));
                getPermute(tiles,sb,idx,visited,set);
                sb.deleteCharAt(sb.length()-1);
                visited[i]=false;
            }
        }
    }
}
