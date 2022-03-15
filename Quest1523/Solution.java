public class Solution {
    public int countOdds(int low, int high) {
        int result = (high - low) /2;
        if(low % 2 != 0 || high % 2 != 0) {
            result++;
        }
        
        return result;
    }
}
