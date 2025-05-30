class Solution {
    public int strStr(String haystack, String needle) {
        
        if (haystack.length() < needle.length())
            return -1;
    
        for (int i = 0; i < haystack.length(); i++) {

            int hayPointer = i;
            int needlePointer = 0;
            while (hayPointer < haystack.length() && 
                    haystack.charAt(hayPointer) == needle.charAt(needlePointer)) {

                //System.out.print(haystack.charAt(hayPointer));
                needlePointer++;
                hayPointer++;
                if (needlePointer == needle.length())
                    return i;
            }
            //System.out.println(i);
        }
        return -1;
    }
}