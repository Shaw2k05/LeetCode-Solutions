class Solution {
    public int romanToInt(String s) {
        
        int len = s.length();
        int curr = roman(s.charAt(0));

        if(len == 1)
            return curr;
        
        int next = 0;
        int total = 0;

        for(int i = 0; i < len - 1; i++) {
            
            next = roman(s.charAt(i + 1));
            if(curr < next) {
                total -= curr;
            }
            else {
                total += curr;
            }

            curr = next;
        }

        return total + next;
    }

    public int roman(char ch) {

        switch(ch) {
            
            case 'I':
            return 1;

            case 'V':
            return 5;

            case 'X':
            return 10;

            case 'L':
            return 50;

            case 'C':
            return 100;

            case 'D':
            return 500;

            case 'M':
            return 1000;
        }

        return 0;
    }
}