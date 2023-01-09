import java.util.LinkedList;
import java.util.List;

public class InOrder {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        inorder(root,list);
        return list;
    }
    private void inorder(TreeNode root, List<Integer> list){
        if (root == null){
            return;
        }
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right, list);
    }
}
