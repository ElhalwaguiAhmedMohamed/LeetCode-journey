class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        backtrack(list,"", 0,0, n);
        return list;
    }

    public void backtrack(List<String> list, String str, int open, int closed, int n){
        if(str.length() == n*2){
            list.add(str);
            return;
        }
        if(open < n){
            backtrack(list, str+"(", open+1, closed, n);
        }
        if(closed < open){
            backtrack(list, str+")", open, closed+1, n);
        }
    }
}