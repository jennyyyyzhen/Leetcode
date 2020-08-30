class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length+nums2.length;
        if (nums1.length > nums2.length){
            int[] temp = nums2;
            nums2 = nums1;
            nums1 = temp;
        }
        
        int medianLength =(totalLength+1)/2;
        int low = 0;
        int high = nums1.length;
        while(low <= high){
          int mid1 = low + (high-low)/2;
          int mid2 = medianLength-mid1;
          int nums1Low = mid1 ==0? Integer.MIN_VALUE:nums1[mid1-1];
          int nums1High = mid1 == nums1.length? Integer.MAX_VALUE:nums1[mid1];
          int nums2Low = mid2 == 0? Integer.MIN_VALUE: nums2[mid2-1];
          int nums2High = mid2 == nums2.length? Integer.MAX_VALUE:nums2[mid2];
          if (nums1Low <= nums2High && nums1High >= nums2Low){
              if(totalLength%2 == 1){
                  return Math.max(nums1Low, nums2Low);
              } else{
                  return (double) (Math.max(nums1Low,nums2Low)+Math.min(nums1High, nums2High))/2;
              }
          } else if (nums1Low > nums2High){
              high = mid1-1;
          }  else{
              low = mid1+1;
          }    
        }
        return 0.0;
    }
}
