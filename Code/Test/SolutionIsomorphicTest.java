import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionIsomorphicTest {
    // Attributes
    String s1 = "egg";
    String t2 = "add";


    String s2 = "edg";
    String t1 = "ad";
    String t3 = "acd";

    SolutionIsomorphic solutionIsomorphic = new SolutionIsomorphic();


    // Tests

    @Test
    void isNotIsomorphic() {
        assertFalse(solutionIsomorphic.isIsomorphic(s1, t1));
        assertFalse(solutionIsomorphic.isIsomorphic(s1, t3));
        assertFalse(solutionIsomorphic.isIsomorphic(s2, t2));
    }

    @Test
    void isIsomorphic() {
        assertTrue(solutionIsomorphic.isIsomorphic(s1, t2));
    }


}



