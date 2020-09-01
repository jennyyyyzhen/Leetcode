class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i =0; i< nums.length-2;i++){
            if(i!=0 && nums[i] == nums[i-1]) continue;
            int start = i+1;
            int end = nums.length-1;
            int target = -nums[i];
            while(start< end){
                if(nums[start]+nums[end] == target){
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[start]);
                    l.add(nums[end]);
                    result.add(l);
                    start++;
                    while(start<end && nums[start]==nums[start-1])
                        start++;
                    end--;
                    while(end>start && nums[end] == nums[end+1])
                        end--;
                } else if(nums[start]+nums[end]<target){
                    start++;
                    while(start<end && nums[start]==nums[start-1])
                        start++;
                } else{
                    end--;
                    while(end>start && nums[end] == nums[end+1])
                        end--;
                }
            }
        }
        return result;
    }
}
