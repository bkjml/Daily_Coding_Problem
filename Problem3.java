class Node{
    private String val;
    private Node left;
    private Node right;

    public Node(String val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public Node(String val) {
        this.val = val;
    }

    public Node(String val, Node left) {
        this.val = val;
        this.left = left;
    }


    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}

public class Problem3 {

//    Good morning! Here's your coding interview problem for today.
//    This problem was asked by Google.
//    Given the root to a binary tree, implement serialize(root), which serializes the tree into a string, and deserialize(s), which deserializes the string back into the tree.
//    For example, given the following Node class
//    class Node:
//    def __init__(self, val, left=None, right=None):
//    self.val = val
//    self.left = left
//    self.right = right
//    The following test should pass:
//    node = Node('root', Node('left', Node('left.left')), Node('right'))
//            assert deserialize(serialize(node)).left.left.val == 'left.left'


    public static String serialize(Node node){
        if(node == null){
            return "#";
        }
        else{
            return node.getVal() + "," + serialize(node.getLeft()) + "," + serialize(node.getRight());
        }
    }

    public static Node deserialize(String data){
        String[] tokens = data.split(",");
        int t = 0;
        int size = tokens.length;
        if(tokens[0].equals("#")){
            return null;
        }
        else{
            Node node = new Node(tokens[0]);
            node.setLeft(deserialize(tokens[1]));
            node.setRight(deserialize(tokens[2]));

            return node;
        }
    }


    public static void main(String[] args){
        Node node = new Node("root", new Node("left", new Node("left.left")), new Node("right"));
        String serializedTree = serialize(node);
        Node deserializedTree = deserialize(serializedTree);
        System.out.println(deserializedTree.getLeft().getLeft().getVal());
    }





}
