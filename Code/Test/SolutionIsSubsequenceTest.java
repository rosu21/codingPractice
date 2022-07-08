import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionIsSubsequenceTest {
    String s1 = "abc";
    String t1 = "ahbgdc";

    String s2 = "axc";
    String t2 = "ahbgdc";

    String s3 = "acb";
    String t3 = "ahbgdc";

    SolutionIsSubsequence solutionIsSubsequence = new SolutionIsSubsequence();


    @Test
    void isSubsequence() {
        assertTrue(solutionIsSubsequence.isSubsequence(s1, t1));

    }

    @Test
    void isNotSubsequence() {
        assertFalse(solutionIsSubsequence.isSubsequence(s2, t2));
    }

    @Test
    void wrongOrder(){
        assertFalse(solutionIsSubsequence.isSubsequence(s3, t3));
    }

}