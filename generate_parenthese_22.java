class Solution {
    List<String> result = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        backtrack(n,n,"");
        return result;
    }
    public void backtrack(int first, int second, String s){
        if(first == 0 && second == 0){
            result.add(s);
        } else{
            if(first<second){
                if(first>0)
                    backtrack(first-1, second, s+'(');
                if(second>0)
                    backtrack(first, second-1, s+')');
            } else{
                backtrack(first-1, second, s+'(');
            }
        }
    }
}
