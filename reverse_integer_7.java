class Solution {
    public int reverse(int x) {
        if(x == Integer.MIN_VALUE) return 0;
        int result = 0;
        boolean flag = x<0;
        x = Math.abs(x);
        while(x!=0){
            if (result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE / 10 && x%10 > 7)) return 0;
            if (result < Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE / 10 && -(x%10) < -8)) return 0;
            result *=10;
            result += flag? -(x%10): x%10;
            x /= 10;
        }
        return result;
    }
}
