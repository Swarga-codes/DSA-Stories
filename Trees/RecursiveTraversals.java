package Trees;

public class RecursiveTraversals {
    void preorder(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.data);
        preorder(node.left);
        preorder(node.right);
    }
    void inorder(Node node){
        if(node==null){
            return;
        }
        inorder(node.left);
        System.out.println(node.data);
        inorder(node.right);
    }
    void postorder(Node node){
        if(node==null){
            return;
        }
       postorder(node.left);
       postorder(node.right);
       System.out.println(node.data);
    }
}
