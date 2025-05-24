class Solution {
    public int myAtoi(String s) {
        char[] str = s.toCharArray();
        int idx = 0;
        int result = 0;
        boolean sign = true;

        while(idx < str.length && str[idx] == ' ')
            idx++;
        if(idx >= str.length)
            return 0;

        if(str[idx] == '+' || str[idx] == '-') {
            if(str[idx] == '-')
                sign = false;
            idx++;
        }

        for(int i = idx; i < str.length; i++) {
            int digit = str[i] - 48;
            if(digit >= 0 && digit <= 9) {
                if(result > (Integer.MAX_VALUE - digit) / 10)
                    return sign ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                result = (result * 10) + digit;
            }
            else
                break;
        }

        return sign ? result : -result;
    }
}