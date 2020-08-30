class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        int cycle = (numRows-1)*2;
        int length = s.length();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i<numRows;i++){
            int j =0;
            while(j*cycle <length){
                if(i == 0 || i ==numRows-1){
                    int index = j*cycle+i;
                    if(index < length){
                        result.append(s.charAt(index));
                    }
                } else{
                    int index1 = j*cycle+i;
                    int index2 = (j+1)*cycle-i;
                    if(index1 <length){
                        result.append(s.charAt(index1));
                    }
                    if(index2<length){
                        result.append(s.charAt(index2));
                    }
                }
                j++;
            }
        }
        return result.toString();
    }
}
