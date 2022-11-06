package Trees;

public class MaximumDepthOfBinaryTree {
 public int MaxDepth(Node node){
    if(node==null){
        return 0;
    }
    int left=MaxDepth(node.left);
    int right=MaxDepth(node.right);
    return 1+Math.max(left,right);
 }
}
