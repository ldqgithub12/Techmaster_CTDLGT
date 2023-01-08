import java.util.LinkedList;
import java.util.List;

public class MyBinaryTree {
    public TreeNode insertToBST(TreeNode root, int val){
        TreeNode newNode = new TreeNode(val);
        if (root == null){
            return newNode;
        }
        TreeNode currNode = root;
        while (true){
            if (val < currNode.val){
                currNode = currNode.left;
                if (currNode.left ==null){
                    currNode.left = newNode;
                    break;
                }
                else {
                    currNode = currNode.left;
                }
            }
            else {
                currNode = currNode.right;
                if (currNode.right == null){
                    currNode.right = newNode;
                    break;
                }
                else currNode = currNode.right;
            }
        }
        return root;
    }
    public TreeNode insertToBTS_rec(TreeNode root,int val){
        if (root == null){
            return new TreeNode(val);
        }
        if (val < root.val){
            root.left = insertToBTS_rec(root.left,val);
        }
        else {
            root.right = insertToBTS_rec(root.right,val);
        }
        return root;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null){
            return root;
        }
        if (key < root.val){
            root.left = deleteNode(root.left,key);
        }
        else if (key> root.val){
            root.right = deleteNode(root.right,key);
        }
        else {
            if (root.left == null && root.right == null){
                return null;
            }
            if (root.left != null && root.right == null){
                return root.left;
            }
            if (root.left == null && root.right != null){
                return root.right;
            }
            root.val = minOfSubRightTree(root.right);
            root.right = deleteNode(root.right, root.val);
        }
        return root;
    }

    private int minOfSubRightTree(TreeNode right) {
        while (right.left != null){
            right = right.left;
        }
        return right.val;
    }
    public TreeNode searchBST(TreeNode root, int val) {
        if (root.val == val || root == null){
            return root;
        }if (val < root.val){
            return searchBST(root.left, val);
        }
        else {
            return searchBST(root.right,val);
        }
    }

    public List<Integer> preorderTraversal(TreeNode treeNode){
        List<Integer> list = new LinkedList<>();
        preorder(treeNode,list);
        return list;
    }
    private void preorder(TreeNode root, List<Integer> list){
        if (root == null){
            return;
        }
        list.add(root.val);
        preorder(root.left,list);
        preorder(root.right, list);
    }
}
