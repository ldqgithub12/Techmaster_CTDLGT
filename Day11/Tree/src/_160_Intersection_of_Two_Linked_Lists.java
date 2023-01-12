import java.util.HashSet;
import java.util.Set;

public class _160_Intersection_of_Two_Linked_Lists {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        //Add hết List node a vào Hash set
        //Sau đó add node list b vào hash set
        // Nếu đã tồn tại node a = node b thì là node đầu tiên bằng nhau
        //Return node b đó
        //Độ phức tạp O(2n)
        while (headA != null){
            set.add(headA);
            headA = headA.next;
        }
        while (headB != null){
            if (set.contains(headB)){
                return headB;
            }
            set.add(headB);
            headB = headB.next;
        }
        return null;
    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
}
