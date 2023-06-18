class TreeNode{
    int val;
    TreeNode left, right;

    public TreeNode(int value){
        this.val = value;
        this.left = null;
        this.right = null;
    }


}


public class Problem8 {

//    Good morning! Here's your coding interview problem for today.
//    This problem was asked by Google.
//    A unival tree (which stands for "universal value") is a tree where all nodes under it have the same value.
//    Given the root to a binary tree, count the number of unival subtrees.


    public static void main(String[] args){
        System.out.println("--------------------------------");
        System.out.println("Unival trees!");

        TreeNode node = new TreeNode(1);

        System.out.println(countUnivalSubtrees(node));
    }


    public static int countUnivalSubtrees(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int count = countUnivalSubtrees(root.left) + countUnivalSubtrees(root.right);
        if (isUnival(root)) {
            count++;
        }
        return count;
    }

    private static boolean isUnival(TreeNode node) {
        if (node == null) {
            return true;
        }
        if (node.left != null && node.left.val != node.val) {
            return false;
        }
        if (node.right != null && node.right.val != node.val) {
            return false;
        }
        return isUnival(node.left) && isUnival(node.right);
    }

}
