import java.util.List;

public class SolutionReverseList {

    public ListNode reverseList(ListNode head){

        // Base case 1: empty
        if (head==null){
            return head;
        }

        // Base case 2: one element
        if (head.next == null) {
            return head;
        }

        // Recursion
        ListNode nextElem = head.next;
        head.next = null;

        ListNode rest = reverseList(nextElem); // go through rest of list

        nextElem.next = head; // add to end

        return rest;




    }

}
