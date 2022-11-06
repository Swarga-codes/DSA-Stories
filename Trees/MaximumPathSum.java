package Trees;

public class MaximumPathSum {
    public int MaxPathSummation(Node root){
        int[] path=new int[1];
        path[0]=Integer.MIN_VALUE;
        MaxPathFind(root, path);
        return path[0];
    }
    public int MaxPathFind(Node root,int[] path){
        if(root==null){
            return 0;
        }
        int left=Math.max(0,MaxPathFind(root.left, path));
        int right=Math.max(0,MaxPathFind(root.right, path));
        path[0]=Math.max(path[0], root.data+left+right);
        return root.data+Math.max(left, right);
    }
}
