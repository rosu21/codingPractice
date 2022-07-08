import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionReverseListTest {

    SolutionReverseList solutionReverseList = new SolutionReverseList();
    ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
    ListNode output = new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1)))));





    // Need to work on test, does not test entire list
    @Test
    void reverseList() {
        assertEquals(solutionReverseList.reverseList(head).val, output.val);

    }

    @Test
    void isEmpty() {
        assertEquals(solutionReverseList.reverseList(null), null);
    }
}