import java.util.Scanner;

public class anujtree {
    static class Node{
        int data;
         Node left;
         Node right;
         public Node(int value){
             this.data = value;
         }
        static Scanner a = new Scanner(System.in);
    }
    public static Node create(){
        Scanner a = new Scanner(System.in);
        Node root = null;
        System.out.println("Enter the value: ");
        int value = a.nextInt();
        if(value==-1){
            return null;
        }
        root = new Node(value);
        System.out.println("Enter data for left  child of: "+value);
        root.left = create();
        System.out.println("Enter data for right child of: "+value);
        root.right = create();

        return root;
    }

    public static void main(String[] args) {
        create();
    }
}
