import java.util.LinkedList;
import java.util.Queue;

public class preorder {
   static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static class binaryTree{
      static int idx = -1;
       public Node create(int arr[]){
        idx++;
        if(idx >= arr.length || arr[idx] == -1){
            return null;
        }
        Node newNode = new Node(arr[idx]);
        newNode.left = create(arr);
        newNode.right = create(arr);
        return newNode;
    }
   }
   //PRE-ORDER
    public static void preorder(Node root){
           if(root == null){
               return;
           }
        System.out.print(root.data+" ");
           preorder(root.left);
           preorder(root.right);
    }
    //IN-ORDER
    public static void inorder(Node root){
       if(root == null){
           return;
       }
       inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    //Level order traversal
    public static void levelOrder(Node root){
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        que.add(null);
         while(!que.isEmpty()){
             Node currNode = que.remove();
             if(currNode == null){
                 System.out.println();
                 if(que.isEmpty()){
                     break;
                 }else {
                     que.add(null);
                 }
             }else {
                 System.out.print(currNode.data+" ");
                 if(currNode.left != null){
                     que.add(currNode.left);
                 }if(currNode.right != null){
                     que.add(currNode.right);
                 }
             }
         }
    }


    public static void main(String[] args) {
       int [] arr = {1,2,3,-1,-1,4,-1,-1,5,-1,4};
       binaryTree tree = new binaryTree();
       Node root = tree.create(arr);
//        System.out.println(root.data);
//        preorder(root);
//        inorder(root);
        levelOrder(root);
    }
}
