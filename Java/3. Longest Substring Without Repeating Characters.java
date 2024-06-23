class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int max_len=0;

        HashSet<Character> hash = new HashSet<>();
        
        while(end<s.length()){
            char c = s.charAt(end);
            if(!hash.contains(c)){
                hash.add(c);
                end++;
            }
            else{
                hash.remove(s.charAt(start));
                start++;
            }
            max_len = Math.max(max_len, end-start);
        }

        return max_len;
    }
}