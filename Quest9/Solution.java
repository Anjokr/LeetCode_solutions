public class Solution  {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        
        String original = Integer.toString(x);
        String[] originalArr = original.split("");
        String reverse = "";

        for(int i = original.length()-1; i >= 0; i--){
            reverse += originalArr[i];
        }
        if(reverse.equals(original)) {
            return true;
        } else {
            return false;
        }
    }
}
