class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefixProduct = 1, suffixProduct = 1;
        int[] res = new int[nums.length];
        //Prefix product
        for(int i = 0; i < nums.length; i++){
            res[i] = prefixProduct;
            prefixProduct *= nums[i];
        }
        // Suffix product
        for(int i = nums.length - 1; i >= 0; i--){
            res[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }
        return res;
    }
}