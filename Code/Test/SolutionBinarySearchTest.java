import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class SolutionBinarySearchTest {
    SolutionBinarySearch solutionBinarySearch = new SolutionBinarySearch();
    int[] nums = {-1, 0, 3, 5, 9, 12};
    int[] nums1 = {5};
    int[] empty = {};
    int target = 9;
    int output = 4;


    @Test
    void searchTest() {
        assertEquals(output, solutionBinarySearch.search(nums, target));
    }

    @Test
    void notFoundTest() {
        assertEquals(-1, solutionBinarySearch.search(nums, 2));
    }

    @Test
    void emptyTest() {
        assertEquals(-1, solutionBinarySearch.search(empty, 2));
    }

    @Test
    void oneElementTest(){
        assertEquals(0, solutionBinarySearch.search(nums1,5));
    }
}