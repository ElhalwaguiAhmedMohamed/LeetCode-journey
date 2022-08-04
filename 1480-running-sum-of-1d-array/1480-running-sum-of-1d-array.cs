public class Solution {
    public int[] RunningSum(int[] nums) {
        int runningsum = 0;
        for(int i=0 ; i<nums.Length ; i++){
            runningsum +=nums[i];
            nums[i] = runningsum;
        }
        return nums;
    }
}