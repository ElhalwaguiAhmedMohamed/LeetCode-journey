class Solution {
    public int[] plusOne(int[] digits) {
        int end = digits.length-1;
        for(int i = end; i>=0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
    
}
// TO --> O(n)
// SC --> O(n)

// [1,2,3]
//  = 123
// 123 + 1 = 124
// if 129 --> 130
/// [7,8,9,9] --> 7899 + 1 = 7900
