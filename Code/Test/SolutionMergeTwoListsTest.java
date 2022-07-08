import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionMergeTwoListsTest {
    SolutionMergeTwoLists solution = new SolutionMergeTwoLists();

    ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
    ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
    ListNode output = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));





    //Need to work on this test
    @Test
    void mergeTwoLists() {
        assertEquals(solution.mergeTwoLists(list1, list2).val, output.val);
    }

    @Test
    public void isEmptyTest(){
        assertEquals(solution.mergeTwoLists(null, null), null);
    }





}