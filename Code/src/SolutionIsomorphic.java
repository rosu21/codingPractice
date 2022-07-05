import java.util.HashMap;

public class SolutionIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        boolean isIsomorphic = false;

        // case 1: length of s and t is unequal
        if (s.length() != t.length()){
            isIsomorphic = false;
            return isIsomorphic;
        }

        char[] sChArray = s.toCharArray();
        char[] tChArray = t.toCharArray();

        HashMap<Character, Character> mappingStoT = new HashMap<Character, Character>();
        HashMap<Character, Character> mappingTtoS = new HashMap<Character, Character>();

        for (int i = 0; i < s.length(); i++){

            // case 2: equal length of s and t, but not isomorphic
            // idea: use HashMap<Char, Char>, if key e already used and value e1 != value e2 then its not isomorphic
            // need to check both directions, s->t and t->s

            // s -> t
            if (mappingStoT.get(sChArray[i])!= null && mappingStoT.get(sChArray[i]) != tChArray[i]){
                isIsomorphic = false;
                return isIsomorphic;
            }

            // t -> s
            if (mappingTtoS.get(tChArray[i])!= null && mappingTtoS.get(tChArray[i]) != sChArray[i]){
                isIsomorphic = false;
                return isIsomorphic;
            }

            // case 3: isomorphic
            mappingStoT.put(sChArray[i], tChArray[i]);
            mappingTtoS.put(tChArray[i], sChArray[i]);


        }

        isIsomorphic = true;
        return isIsomorphic;
    }










}






