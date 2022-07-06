import java.util.List;

public class SolutionMergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        //Base case
        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        // Case 2: both list not empty, recursion
            // value of list1 < list2 add list1.val and move up in list 1
        else if (list1.val <= list2.val) {
            return new ListNode(list1.val, mergeTwoLists(list1.next, list2));

        } else { // if (list1.val > list2.val)
            return new ListNode(list2.val, mergeTwoLists(list1, list2.next));
        }

    }
}
