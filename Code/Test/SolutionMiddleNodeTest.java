import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionMiddleNodeTest {
    SolutionMiddleNode solutionMiddleClass = new SolutionMiddleNode();

    ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
    ListNode list2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
    ListNode output = new ListNode(3, new ListNode(4, new ListNode(5)));
    ListNode output2 = new ListNode(4, new ListNode(5, new ListNode(6)));



    //Test überdenken, hier wird nur erster Wert geprüft
    // vielleicht rekursiv durchgehen?

    @Test
    void middleNode() {
        assertEquals(output.val, solutionMiddleClass.middleNode(list1).val);
    }

    @Test
    void twoMiddleNode() {
        assertEquals(output2.val, solutionMiddleClass.middleNode(list2).val);
    }

    @Test
    void isEmpty() {
        assertEquals(solutionMiddleClass.middleNode(null), null);
    }

}