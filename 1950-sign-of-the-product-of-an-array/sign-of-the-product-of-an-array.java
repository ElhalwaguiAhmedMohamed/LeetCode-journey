class Solution {
    public int arraySign(int[] nums) {
        int negNumbers = 0;
        for(int num : nums){
            if(num == 0) return 0;
            if(num < 0) negNumbers++;
        }
        if(negNumbers%2 != 0){
            return -1;
        }
        return 1;
    }
}