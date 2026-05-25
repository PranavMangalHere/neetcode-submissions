class Solution {

    private void solve(int n, StringBuilder output, List<String> ans, int open , int close){
        if(open+close == n+n){
            ans.add(output.toString());
            return ;
        }
        if(open < n){
            output.append("(");
            solve(n, output, ans, open + 1, close);
            output.deleteCharAt(output.length() - 1);
        }
        if(close < open){
            output.append(")");
            solve(n, output, ans, open, close + 1);
            output.deleteCharAt(output.length() - 1);
        }
    }

    public List<String> generateParenthesis(int n) {
        StringBuilder output = new StringBuilder();
        List<String> ans = new ArrayList<>();
        solve(n, output, ans, 0, 0);
        return ans;
    }
}
