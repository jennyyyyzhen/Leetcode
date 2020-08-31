class Solution {
    public boolean isMatch(String s, String p) {
        boolean[][] dp =new boolean[s.length()+1][p.length()+1];
        dp[0][0] = true;
        for(int i=1; i<=p.length();i++){
            if(p.charAt(i-1) == '*')
                dp[0][i] = dp[0][i-2];
        }
        for(int i=1; i<=p.length(); i++){
            for(int j=1; j<=s.length(); j++){
                if(p.charAt(i-1) == '*'){
                    dp[j][i] = dp[j][i-2];
                    if(s.charAt(j-1) == p.charAt(i-2) || p.charAt(i-2)=='.'){
                        dp[j][i] = dp[j-1][i] || dp[j][i-2]; 
                    }
                }
                if(s.charAt(j-1) == p.charAt(i-1) || p.charAt(i-1)=='.'){
                    dp[j][i]=dp[j-1][i-1];
                }
            }
        }
        return dp[s.length()][p.length()];
    }
}
