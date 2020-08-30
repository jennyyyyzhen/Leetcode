class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        int start = 0;
        int end = 0;
        int max = 0;
        HashSet<Character> hs = new HashSet<>();
        while(end<s.length()){
            char c = s.charAt(end);
            if(!hs.contains(c)){
                hs.add(c);
                max = Math.max(max, end-start+1);
                end++;
            } else{
                hs.remove(s.charAt(start));
                start++;
            }    
        }
        return max;
    }
}
