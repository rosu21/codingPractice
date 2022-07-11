import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class SolutionDetectCycle {


    // Assumption that vals are unique is false. Need different approach!

    /**
     * Given the head of a linked list, return the node where the cycle begins.
     * If there is no cycle, return null.
     *
     * @param head ListNode
     * @return
     */
    public ListNode detectCycle(ListNode head) {
        //int pos = -1;

        // Base case 1: head is empty -> head
        // Base case 2: head is one element -> head
        if (head == null || head.next == null){
            return null;
        }


        HashSet<ListNode> hashSet = new HashSet<>();

        int k = 0;
        while (head != null) {

            if (hashSet.contains(head)) {
          //      pos = k;
                return head;
            } else {
                hashSet.add(head);
            }
            head = head.next;
            k++;
        }
        return null;











    }
}
