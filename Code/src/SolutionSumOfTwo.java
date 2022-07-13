import java.util.HashMap;
import java.util.HashSet;

public class SolutionSumOfTwo {

    public boolean sumOfTwo(int[] a, int[]b, int v) {

        // Brute force solution
        /*
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < b.length; j++){
                if (a[i]+b[j]==v){
                    return true;
                }
            }
        }
        return false;

         */

        HashSet<Integer> hashSet = new HashSet<>();


        for (int i = 0; i < a.length; i++){
            if (hashSet.contains(v-a[i]) == false){
                hashSet.add(v-a[i]);
            }
        }

        for (int j = 0; j < b.length; j++) {
            if (hashSet.contains(b[j])){
                return true;
            }
        }
        return false;
    }
}
