// Input: target = 7, nums = [2,3,1,2,4,3]
// sum = 6;
// minLen = 6
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;
        int sum = 0;
        while(end <= nums.length-1){
            sum += nums[end];
            end++;
            while(sum >= target){
                minLen = Math.min((end - start), minLen);
                sum -= nums[start];
                start++;
            }
        }
        return minLen == Integer.MAX_VALUE? 0 : minLen;
    }
}