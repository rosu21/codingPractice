public class SolutionIsSubsequence {
    public boolean isSubsequence(String s, String t) {


        // Case 1: String s is empty -> true
        if (s.isEmpty()){
            return true;
        }

        // Case 2: s is longer than t -> false
        if (s.length() > t.length()) {
            return false;
        }


        // Case 3: s and t both only length 1 -> test
        if (s.length() == t.length() && t.length() == 1){
            if (s == t) {
                return true;
            } else {
                return false;
            }
        }


        int k = 0;
        int i = 0;
        while(k < s.length() && i < t.length()) {

            // if char of s found in t, look at next char of s
            if (s.charAt(k) == t.charAt(i)) {
                k++;
            }
            // search through rest of t
            i++;
        }


        if (k == s.length()) {
            return true;
        }

        return false;
    }
    }



