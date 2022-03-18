public class Solution {
    public int hammingWeight(int n) {
        int result = 0;
        char[] array = Integer.toBinaryString(n).toCharArray();
        result = search(array);
        return result;
    }

    public int search(char[] array) {
        int count = 0;
        for(char c : array) {
            int number = Character.getNumericValue(c);;
            if(number==1) {
                count++;
            }
        }
        return count;
    }
}
