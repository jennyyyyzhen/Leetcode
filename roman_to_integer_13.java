class Solution {
    public int romanToInt(String s) {
        int[] number = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] rom = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int index = 0;
        int num = 0;
        while(index<s.length()){
            for(int i=0; i<rom.length; i++){
                String substring = s.substring(index);
                if(substring.startsWith(rom[i])){
                    num+=number[i];
                    index+=rom[i].length();
                    break;
                }
            }
        }
        return num;
    }
}
