class Solution {
    public int arrayPairSum(int[] nums) {
        int a=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=2)
        {
            a+=nums[i];
        }
        return a;
    }
}