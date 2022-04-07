class Solution {
    public int subtractProductAndSum(int n) {
        int result = 0;
        char[] array = String.valueOf(n).toCharArray();
        result = search(array);
        return result;
    }

    public int search(char[] array) {
        int sum = 0;
        int product = 1;
        for(char c : array) {
            int number = Character.getNumericValue(c);;
            sum += number;
            product *= number;
        }

        return product - sum;
    }
}