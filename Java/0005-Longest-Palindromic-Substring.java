class Solution {
    public String longestPalindrome(String s) {
        
        String max = s.substring(0, 1);

        for (int i = 0; i < s.length(); i++) {

            String odd = expand(i, i, s);
            String even = expand(i, i + 1, s);

            if(odd.length() > max.length())
                max = odd;
            if(even.length() > max.length())
                max = even;
        }

        return max;
    }

    public String expand(int left, int right, String s) {

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}