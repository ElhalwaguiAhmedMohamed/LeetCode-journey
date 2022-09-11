public class Solution {
    public bool ContainsDuplicate(int[] nums) {
        Array.Sort(nums);
        
        if(nums.Length == 0)
            return false;
        
        int currentNum = nums[0];
        for(int i=1 ; i<nums.Length ; i++){
            if(currentNum == nums[i]){
                return true;
            }else{
                currentNum = nums[i];
            }
        }
        return false;
    }
}