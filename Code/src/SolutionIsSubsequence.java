public class SolutionIsSubsequence {
    public boolean isSubsequence(String s, String t) {
        boolean isSubsequence = false;

        if (s.isEmpty()){
            return true;
        }

        if (s.length() > t.length()) {
            return false;
        }


        if (s.length() == t.length() && t.length() == 1){
            if (s == t) {
                isSubsequence = true;
            } else {
                isSubsequence = false;
            }
            return isSubsequence;
        }


        int k = 0;
        int i = 0;
        while(k < s.length()-1 && i < t.length()) {

            if (s.charAt(k) == t.charAt(i)) {

                k++;
            }
            i++;
        }

        if (k == s.length()) {

            isSubsequence = true;
        } else {
            isSubsequence = false;
        }

        return isSubsequence;
    }
    }



