import java.util.LinkedList;
import java.util.List;

public class postOder {
    public List<Integer> postorderTraversal(TreeNode treeNode){
        List<Integer> list = new LinkedList<>();
        postorder(treeNode,list);
        return list;
    }
    private void postorder(TreeNode root, List<Integer> list){
        if (root == null){
            return;
        }
        postorder(root.left,list);
        postorder(root.right, list);
        list.add(root.val);
    }
}
