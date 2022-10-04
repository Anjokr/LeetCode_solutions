public class Solution {
    public int romanToInt(String s) {
        char[] chs = s.toCharArray();
        int result = 0;
        //iterate through each char in the roman string from end to the start
        for(int i = chs.length-1; i >= 0; i--) {
            if(chs[i]=='M') {
                if(i != 0 && chs[i-1] == 'C') {
                    result += 900;
                    i--;
                    continue;
                } else {
                    result += 1000;
                    continue;
                }
            }
            if(chs[i]=='D') {
                if(i != 0 && chs[i-1] == 'C') {
                    result += 400;
                    i--;
                    continue;
                } else {
                    result += 500;
                    continue;
                }
            }

            if(chs[i]=='C') {
                if(i != 0 && chs[i-1] == 'X') {
                    result += 90;
                    i--;
                    continue;
                } else {
                    result += 100;
                    continue;
                }
            }
            if(chs[i]=='L') {
                if(i != 0 && chs[i-1] == 'X') {
                    result += 40;
                    i--;
                    continue;
                } else {
                    result += 50;
                    continue;
                }
            }

            if(chs[i]=='X') {
                if(i != 0 && chs[i-1] == 'I') {
                    result += 9;
                    i--;
                    continue;
                } else {
                    result += 10;
                    continue;
                }
            }
            if(chs[i]=='V') {
                if(i != 0 && chs[i-1] == 'I') {
                    result += 4;
                    i--;
                    continue;
                } else {
                    result += 5;
                    continue;
                }
            }

            if(chs[i]=='I') {
                result++;
                continue;
            }
        }
        
        return result;
    }
}
