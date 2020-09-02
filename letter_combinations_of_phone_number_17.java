class Solution {
    List<String> result = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return new ArrayList<String>();
        String[] map = new String[]{"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        helper(map, digits, 0, "");
        return result;
    }
    public void helper(String[] map, String digits, int index, String s){
        if(index == digits.length()){
            result.add(s);
        } else{
            int num = digits.charAt(index)-'0';
            for(int i=0; i<map[num-2].length(); i++){
                helper(map, digits, index+1, s+map[num-2].charAt(i));
            }
        } 
    }
}
