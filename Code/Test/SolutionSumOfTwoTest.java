import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionSumOfTwoTest {
    SolutionSumOfTwo solutionSumOfTwo = new SolutionSumOfTwo();
    int[] a = {1,2,3,4};
    int[] b = {1,2,3,4};
    int[] a2 = {};



    @Test
    void sumOfTwoTest() {
        assertTrue(solutionSumOfTwo.sumOfTwo(a,b,5));
    }

    @Test
    void sumOfTwoFalseTest() {
        assertFalse(solutionSumOfTwo.sumOfTwo(a,b,10));
    }


    @Test
    void emptyTest() {
        assertFalse(solutionSumOfTwo.sumOfTwo(a2,a2,3));
    }


}