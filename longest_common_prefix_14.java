class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        String result = "";
        int i =0;
        while(i>= 0){
            char c;
            if(strs[0].length() > i){
                c = strs[0].charAt(i);
            } else{
                break;
            }
            for(String str: strs){
                if(str.length() <= i || str.charAt(i) != c){
                    i=-1;
                    break;
                }
            }
            if(i!= -1){
                result+=c;
                i++;
            }
        }
        return result;
    }
}
