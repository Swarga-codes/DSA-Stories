package Trees;
public class InvertABinaryTree {
    public Node invertTree(Node root) {
        if(root==null){
            return null;
        }
        Node tmp=root.left;
        root.left=root.right;
        root.right=tmp;
        Node left=invertTree(root.left);
        Node right=invertTree(root.right);
    return root;
    }
}
