public class Main {

    public static void main(String args[]){
        SolutionIsomorphic solution = new SolutionIsomorphic();

        String s = "egg";
        String t = "add";

        String s2 = "axc";
        String t2 = "ahbgdc";

        String s3 = "acb";
        String t3 = "ahbgdc";


        SolutionIsSubsequence solutionIsSubsequence = new SolutionIsSubsequence();


        //isIsomorphic
        //System.out.print(solution.isIsomorphic(s,t));

        solutionIsSubsequence.isSubsequence(s3, t3);



    }
}
