class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum = nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1, k=nums.length-1; j<k && i<k;){
                int sum3 = nums[i]+nums[j]+nums[k];
                if(sum3 - target>0){
                    k--;
                } else if(sum3 - target==0){
                    return target;
                } else{
                    j++;
                }
                if(Math.abs(sum3-target)<Math.abs(sum-target)){
                    sum = sum3;
                }
            }
        }
        return sum;
    }
}
