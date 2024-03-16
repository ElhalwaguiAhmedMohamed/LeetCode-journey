class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<Integer>();
        int longestSeq = 0;
        for(int num : nums){
            numSet.add(num);
        }
    
        for(int num : nums){
            if(!numSet.contains(num-1)){
                int len = 0;
                while(numSet.contains(num+len)){
                    len++;
                }
                longestSeq = Math.max(len, longestSeq);
            }
        }
        return longestSeq;
    }
}