class Solution {
    public String intToRoman(int num) {
        int[] number = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] rom = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuffer sb = new StringBuffer();
        while(num>0){
            for(int i=0; i< number.length; i++){
                if(number[i]<=num){
                    num-=number[i];
                    sb.append(rom[i]);
                    break;
                }
            }
        }
        return sb.toString();
    }
}
