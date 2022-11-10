package Trees;

public class IdenticalTrees {
    public boolean identical(Node root1,Node root2){
        if(root1==null || root2==null){
            return (root1==root2);
        }
        return (root1.data==root2.data) && identical(root1.left, root2.left) && identical(root1.right, root2.right);
    }
}
