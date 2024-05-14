class Solution {
    public int removeDuplicates(int[] nums) {
        int p1 = 0, p2 =1;
        int uniqueCount = 1;
        while(p2 < nums.length){
            if(nums[p1] == nums[p2]){
                p2++;
            }else if(nums[p1] != nums[p2]){
                p1++;
                nums[p1] = nums[p2];
                p2++;
                uniqueCount++;
            }
        }
        return uniqueCount;
    }
}
//  1 2     
// [0,1,2,3,4,2,2,3,3,4]
// int p1 = 0, p2=1;
// while(p2 < nums.length)
// if p1 == p2 --> p2++
// else if p1 != p2 --> p1++ , nums[p1] == nums[p2], p2++
// TC --> o(n)
// SC --> O(1)