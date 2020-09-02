class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0; i<nums.length-3; i++){
            int sum3 = target-nums[i];
            for(int j=i+1; j<nums.length-2; j++){
                int sum2 = sum3-nums[j];
                int start = j+1;
                int end = nums.length-1;
                while(start<end){
                    if(nums[start]+nums[end]==sum2){
                        List<Integer> l = new ArrayList<Integer>();
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[start]);
                        l.add(nums[end]);
                        result.add(l);
                        start++;
                        while(start<end && nums[start-1]==nums[start]) start++;
                        end--;
                        while(start<end && nums[end+1] == nums[end]) end--;
                    } else if(nums[start]+nums[end]<sum2){
                        start++;
                        while(start<end && nums[start-1]==nums[start]) start++;
                    } else{
                        end--;
                        while(start<end && nums[end+1] == nums[end]) end--;
                    }
                }
                while(j<nums.length-2 && nums[j] == nums[j+1]) j++;
            }
             while(i<nums.length-3 && nums[i] == nums[i+1]) i++;
        }
        return result;
    }
}
