public class SolutionBinarySearch {

    /**Binary search in sorted array.
     *
     * @param nums sorted in ascending order
     * @param target integer
     * @return index of target
     */
    public int search(int[] nums, int target){
        //Check for empty array
        if (nums.length == 0){
            return -1;
        }

        //initialize beginning and end of search area
        int first = 0;
        int last = nums.length-1;
        int m;


        while(last > first) {
            m = (first + last) / 2; //middle of search area


            if (target > nums[m]) { // go right
                first = m+1;
            } else { // go left
                last = m;
            }
        }


        if (target == nums[first]) {
            return first;
        } else if (target == nums[last]){
            return last;
        }

        return -1;
    }
}
