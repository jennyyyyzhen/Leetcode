class Solution {
    public int myAtoi(String str) {
        int index = 0;
        while(index<str.length()){
            if(str.charAt(index) == ' ') index++;
            else break;
        }
        if(index == str.length()) return 0;
        
        boolean flag = false;
        if(str.charAt(index) == '+') index++;
        else if (str.charAt(index) == '-'){
            flag = true;
            index++;
        }else if (!Character.isDigit(str.charAt(index))) return 0;
        else ;
        
        int result = 0;
        while(index< str.length()){
            char c = str.charAt(index);
            if (!Character.isDigit(c)) return result;
            int digit = c-'0';
            if (result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) return Integer.MAX_VALUE;
            if (result < Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE / 10 && -digit < -8)) return Integer.MIN_VALUE;
            result *=10;
            result += flag? -digit: digit;
            index++;
        }
        return result;
    }
}
