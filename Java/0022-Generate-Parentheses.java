class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> ans = new ArrayList<>();
        balance(n, n, new StringBuilder(), ans);
        return ans;
    }

    public void balance(int left, int right, StringBuilder curr, List<String> ans) {

        if (left == 0 && right == 0) {
            ans.add(curr.toString());
            return;
        }

        if (left > 0) {
            curr.append('(');
            balance(left - 1, right, curr, ans);
            curr.deleteCharAt(curr.length() - 1);
        }

        if (right > left) {
            curr.append(')');
            balance(left, right - 1, curr, ans);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}