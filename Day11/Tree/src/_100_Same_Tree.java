public class _100_Same_Tree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q==null){ // Nếu node p và q đều bằng null thì trả về true vì lúc này cả 2 node đều rỗng giống nhau và là điều kiện dừng của đệ quy
            return true;
        }
        if (p==null || q == null || p.val != q.val){ // Nếu xảy ra trươnng hợp chỉ có node p null hoặc q null hoặc node p và q != nhau thì trả về false;
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        // Xét lần lượt các node duyệt đến node cuối cùng bên trái và bên phải nếu mà = nhau hết thì trả về true vì đã duyệt đến
        // node cuối còn không thì trả về false và khi cả trái và phải đều giống nhau thì trả về true
    }
    //Độ phức tạp thời gian O(1) vì phụ thuộc vào chiều cao của cây

    public static void main(String[] args) {
        TreeNode p1 = new TreeNode(1);
        TreeNode p2 = new TreeNode(2);
        TreeNode p3 = new TreeNode(3);
        TreeNode q1 = new TreeNode(1);
        TreeNode q2 = new TreeNode(2);
        TreeNode q3 = new TreeNode(3);

        p1.left = p2;
        p1.right = p3;
        q1.left = q2;
        q1.right = q3;
        System.out.println(isSameTree(p1,q1));
    }
//    public class TreeNode {
//        int val;
//
//        public TreeNode(int val) {
//            this.val = val;
//        }
//        TreeNode left;
//        TreeNode right;
//    }
}
