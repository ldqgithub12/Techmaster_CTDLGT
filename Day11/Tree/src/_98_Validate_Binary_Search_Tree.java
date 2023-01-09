public class _98_Validate_Binary_Search_Tree {
    public static boolean isValidBST(TreeNode root) {
        return checkValid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    public static boolean checkValid(TreeNode root, long min, long max) {
        if (root == null){
            return true;
        }
        if (root.val >= max || root.val <= min){
            return false;
        }
        return checkValid(root.left, min, root.val) && checkValid(root.right, root.val, max);
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(5);
        TreeNode n2 = new TreeNode(1);
        TreeNode n3 = new TreeNode(4);
        TreeNode n4 = new TreeNode(3);
        TreeNode n5 = new TreeNode(6);

        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
        n3.right = n5;

        System.out.println(isValidBST(n1));
    }
}
