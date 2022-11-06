
package Trees;
import java.util.*;
public class IterativePreorder {
    public class Node {
    
        private int data;
        private Node left;
        private Node right;
        public Node(int key){
        this.data=key;
        }
    }
    public List<Integer> preorderTraversal(Node root) {
        List<Integer> preorder=new ArrayList<>();
         if(root==null){
             return preorder;
         }
         Stack<Node> stack=new Stack<>();
         stack.push(root);
         while(!stack.isEmpty()){
             root=stack.pop();
             preorder.add(root.data);
             if(root.right!=null){
                 stack.push(root.right);
             }
             if(root.left!=null){
                 stack.push(root.left);
             }
         }
         return preorder;
     }
}
