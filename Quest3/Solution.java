import java.io.*;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        String check = "";
        
        if (s.length() == 0) {
            return 0;
        } else if (s.length() == 1) {
            return 1;
        }

        int longest = -1;
        char[] arr = s.toCharArray();
        for (char c : arr) {
            String character = String.valueOf(c);
            if (check.contains(character)) {
                check.substring(check.indexOf(character) + 1);
            }
            check = check + String.valueOf(character);
            longest = Math.max(check.length(), longest);
        }
        return longest;
        
    }
}
