public class FindCenterOfStarGraph {
    public static void main(String[] args) {
        int[][] edges = {{1,2},{2,3},{4,2}};
        System.out.println(findCenter(edges));
    }
    public static int findCenter(int[][] edges) {
        int ans=0;
          if(edges[0][0]==edges[1][0] || edges[0][0]==edges[1][1]) ans=edges[0][0];
          if(edges[0][1]==edges[1][0] || edges[0][1]==edges[1][1]) ans=edges[0][1];
          return ans;
      }
}
