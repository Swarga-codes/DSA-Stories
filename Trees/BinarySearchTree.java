package Trees;

import java.util.ArrayList;

public class BinarySearchTree {
public static class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
    }
}
//inserting nodes in a binary search tree
public static Node insert(Node root,int val){
    if(root==null){
        root=new Node(val);
        return root;
    }
    if(root.data>val){
        root.left=insert(root.left, val);
    }
    else{
        root.right=insert(root.right, val);
    }
    return root;
}
//printing the inorder traversal of a binary search tree
public static void inorder(Node root){
    if(root==null){
        return;
    }
    inorder(root.left);
    System.out.print(root.data+"->");
    inorder(root.right);
}
//searching in a binary search tree
public static boolean search(Node root,int key){
    if(root==null){
        return false;
    }
    if(root.data==key){
        return true;
    }
    if(root.data<key){
        return search(root.right, key);
    }
    else{
        return search(root.left, key);
    }
}
//deleting a node
public static Node delete(Node root,int val){
  if(root.data>val){
    root.left=delete(root.left, val);
  }
  else if(root.data<val){
    root.right=delete(root.right, val);
  }
  else{
    //case 1: if there are no child nodes
    if(root.left==null && root.right==null){
        return null;
    }
    //case 2: if there is one child node 
    if(root.left==null){
        return root.right;
    }
    if(root.right==null){
        return root.left;
    }
     //case 3: if there are two child nodes
  Node IS=inorderSuccessor(root.right);
  root.data=IS.data;
  root.right=delete(root.right, IS.data);
 
  }
 
  return root;
}
public static Node inorderSuccessor(Node root){
    while(root.left!=null){
        root=root.left;
    }
    return root;
}
//Print in range
public static void PrintInRange(Node root,int x ,int y){
    if(root==null){
        return;
    }
    if(root.data>=x && root.data<=y){
        PrintInRange(root.left, x, y);
        System.out.print(root.data+"->");
        PrintInRange(root.right, x, y);
    }
    else if(root.data>y){
        PrintInRange(root.left, x, y);
    }
    else{
        PrintInRange(root.right, x, y);
    }
}
//Print the possible paths from root to leaf
public static void printRoottoLeaf(Node root,ArrayList<Integer> path){
    if(root==null){
        return;
    }
path.add(root.data);
if(root.left==null && root.right==null){
    printThePath(path);
}
else{
    printRoottoLeaf(root.left, path);
    printRoottoLeaf(root.right, path);
}
path.remove(path.size()-1);
}
public static void printThePath(ArrayList<Integer> path){
    for (int i = 0; i < path.size(); i++) {
        System.out.print(path.get(i)+"->");
    }
    System.out.println();
}
public static void main(String[] args) {
    // int[] values={8,5,3,1,4,6,10,11,14};
    int[] values={8,5,3,6,10,11,14};
    // int[] values={5,1,3,2,4,7};
    Node root=null;
    for (int i = 0; i < values.length; i++) {
        root=insert(root, values[i]);
    }
    System.out.println("The inorder traversal of the given BST is: ");
inorder(root);
System.out.println();
System.out.println(search(root, 9));
// delete(root, 3);
// inorder(root);
System.out.println();
System.out.println("The print in range is:");
PrintInRange(root, 6, 12);
System.out.println();
System.out.println("The possible paths are:");
printRoottoLeaf(root,new ArrayList<>());
}
}
