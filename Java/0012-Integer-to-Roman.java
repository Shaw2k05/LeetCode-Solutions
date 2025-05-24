class Solution {
    public String intToRoman(int num) {
            
        StringBuilder builder = new StringBuilder();
        
        while(num >= 1000) {
            num -= 1000;
            builder.append('M');
        }

        if(num >= 900) {
            num -= 900;
            builder.append('C');
            builder.append('M');
        }

        if(num >= 500) {
            num -= 500;
            builder.append('D');
        }

        if(num >= 400) {
            num -= 400;
            builder.append('C');
            builder.append('D');
        }

        while(num >= 100) {
            num -= 100;
            builder.append('C');
        }

        if(num >= 90) {
            num -= 90;
            builder.append('X');
            builder.append('C');
        }

        if(num >= 50) {
            num -= 50;
            builder.append('L');
        }

        if(num >= 40) {
            num -= 40;
            builder.append('X');
            builder.append('L');
        }

        while(num >= 10) {
            num -= 10;
            builder.append('X');
        }

        if(num >= 9) {
            num -= 9;
            builder.append('I');
            builder.append('X');
        }

        if(num >= 5) {
            num -= 5;
            builder.append('V');
        }

        if(num >= 4) {
            num -= 4;
            builder.append('I');
            builder.append('V');
        }

        while(num >= 1) {
            num -= 1;
            builder.append('I');
        }

        return builder.toString();
    }
}