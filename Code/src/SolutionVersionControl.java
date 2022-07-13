public class SolutionVersionControl {
    public boolean isBadVersion(int n){
        if (n>3){
            return true;
        }
        return false;
    }

    public int firstBadVersion(int n){

        int first = 1;
        int last = n;
        int mid;

        while (last > first){
            mid = first+ (last-first) /2;

            if (isBadVersion(mid)){ // go left
                last = mid;
            } else {
                first = mid+1; // go right
            }
        }
        if (isBadVersion(first)){
            return first;
        } else  {
            return -1;
        }



    }
}
