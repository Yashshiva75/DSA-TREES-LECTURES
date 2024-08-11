public class Main {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }
    static class BinaryTree{
        static int idx = -1;
        public Node createNodes(int nodes[]){
            idx++;
            if(idx >= nodes.length || nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = createNodes(nodes);
            newNode.right = createNodes(nodes);
            return newNode;
        }
    }
    public static void main(String[] args) {
        int []nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.createNodes(nodes);
        System.out.println(root.data);
    }
}