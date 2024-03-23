class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int diff = 0;
        int[] res = new int[2];
        for(int i = 0; i < nums.length; i++){
            diff = target - nums[i];
            if(map.containsKey(diff)){
                return new int[] {i, map.get(diff)};
            }
            map.put(nums[i], i);
        }
        return new int[] {0,0};
    }
}