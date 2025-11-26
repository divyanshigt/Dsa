class Solution {
    public int arrayPairSum(int[] nums) {
      Arrays.sort(nums);
      int sum=0;
      for(int i=0;i<nums.length;i=i+2){
            int a=nums[i];
            int b=nums[i+1];
            sum+=Math.min(a,b);
      }
      return sum;
 }
}