package Trees;

public class Node {
    
        private int data;
        private Node left;
        private Node right;
        public Node(int key){
        this.data=key;
        }
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
        public static void main(String[] args) {
            Node root=new Node(4);
            root.left=new Node(5);
            root.right=new Node(6);
        }
    }
    

