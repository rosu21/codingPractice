import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SolutionLongestPalindrome {

    public int longestPalindrome(String s) {

        if (s.length() == 0){
            return 0;
        }

        HashMap<Character, Integer> charMap = new HashMap<>();

        char letter;
        int count = 0;

        for(int i = 0; i<s.length(); i++){
            letter = s.charAt(i);

            if (charMap.containsKey(letter)){
                count = charMap.get(letter) + 1;
            } else {
                count = 1;
            }
            charMap.put(letter, count);
        }

        int maxLength = 0;
        int sum;


        for(Map.Entry<Character,Integer> entry: charMap.entrySet()){
            sum = entry.getValue();
            maxLength += (sum / 2) * 2;

            if (maxLength % 2 == 0 && sum % 2 == 1) {
                maxLength += 1;
            }
        }


        return maxLength;
    }
}


