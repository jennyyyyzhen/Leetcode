class Solution {
    public String longestPalindrome(String s) {
        int start;
        int end;
        int max = 0;
        String result="";
        //odd cass
        for(int i=0; i<s.length(); i++){
            start = i;
            end = i;
            while(start >=0 && end <s.length()){
                if(s.charAt(start)==s.charAt(end)){
                    start --;
                    end ++;
                } else{
                    break;
                }
            }
            if(end-start-1 > max){
                max = end-start-1;
                result = s.substring(start+1, end);
            }    
        }
        //even case
        for(int i=0; i<s.length()-1; i++){
            start = i;
            end = i+1;
            if(s.charAt(start) != s.charAt(end)) continue;
            while(start >=0 && end <s.length()){
                if(s.charAt(start)==s.charAt(end)){
                    start --;
                    end ++;
                } else{
                    break;
                }
            }
            if(end-start-1 > max){
                max = end-start-1;
                result = s.substring(start+1, end);
            }    
        }
       return result; 
    }
}
