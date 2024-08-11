import java.util.LinkedList;
import java.util.Queue;

public class level_order {
    public static void main(String[] args) {
     int[] arr = {1,2,3,-1,-1,4,-1,-1,5,-1,4};
     tree tr = new tree();
     Node root = tr.creater(arr);
     System.out.println(root.data);
     tr.levelOrder(root);
    }
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int value){
            this.data = value;
            this.left = null;
            this.right = null;
        }

    }
     static class tree{
        int idx =-1;
        public Node creater(int []arr){
            idx++;
            if(idx >= arr.length || arr[idx] == -1){
                return null;
            }
          Node a = new Node(arr[idx]);
          a.left = creater(arr);
          a.right = creater(arr);
        return a;
    }
    public void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else {
                    q.add(null);
                }
            }else {
                System.out.print(curr.data+" ");
                if(curr.left!=null){
                q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }

    }
}}
