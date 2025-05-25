class Solution {
    public boolean isValid(String s) {
        
        int len = s.length();
        if(len % 2 != 0) 
            return false;

        char stack[] = new char[len/2];
        int top = -1;

        for (int i = 0; i < len; i++) {

            char curr = s.charAt(i);
            if (curr == '(' || curr == '{' || curr == '[') {

                top++;
                if (top >= len/2)
                    return false;
                stack[top] = curr;
            }
            else {

                if (top >= 0 &&
                        ( (stack[top] == '(' && curr == ')') ||
                          (stack[top] == '{' && curr == '}') ||
                          (stack[top] == '[' && curr == ']') )
                    ) {
                        
                    top--;
                }
                else 
                    return false;
            }
        }
        return top == -1;
    }
}