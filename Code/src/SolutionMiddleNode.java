import java.util.ArrayList;

public class SolutionMiddleNode {

    public ListNode middleNode(ListNode head) {

        // Case 1: head is empty -> head
        // Case 2: head is one element -> head
        if (head == null || head.next == null) {
            return head;
        }


        // Create new list with pointers to linked list
        ArrayList<ListNode> pointer = new ArrayList<>();


        while (head != null) {
            pointer.add(head);
            head = head.next;

        }

        //Initialize pointer to middle element
        int k = 0;
        int n = pointer.size();
        //Check whether there are two middle nodes
        if (n%2 == 0) { // list has two middle nodes
            k = n/2 + 1;
        } else { // list has one middle node
            k = (n-1)/2 + 1;
        }



        return pointer.get(k-1);

    }
}
