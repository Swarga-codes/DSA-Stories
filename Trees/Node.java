package Trees;

public class Node {
    
        public int data;
        public Node left;
        public Node right;
        public Node(int key){
        this.data=key;
        }
       
        public static void main(String[] args) {
            Node root=new Node(4);
            root.left=new Node(5);
            root.right=new Node(6);
        }
    }
    

