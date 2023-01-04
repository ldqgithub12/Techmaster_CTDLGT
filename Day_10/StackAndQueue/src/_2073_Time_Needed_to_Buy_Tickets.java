import java.util.LinkedList;
import java.util.Queue;

public class _2073_Time_Needed_to_Buy_Tickets {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        Queue q = new LinkedList();
        for (int i = 0; i < tickets.length; i++) {
            q.add(i);
        }
        int count = 0;
        while (!q.isEmpty()) {
            ++count;
            int front = (int) q.poll();
            if (tickets[front] >= 1) {
                tickets[front] -= 1;
            }
            if (k != front && tickets[front] == 0) {
                continue;
            }
            if (k == front && tickets[front] == 0) {
                break;
            }
            q.add(front);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] tickets = {2,3,2};
        System.out.println(timeRequiredToBuy(tickets,2));
    }
}

