class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList();
        bakctrack(res, new ArrayList() ,nums, 0);
        return res;
    }
    
    public void bakctrack(List<List<Integer>> list,List<Integer> curr, int[] nums ,int index){
        list.add(new ArrayList<>(curr));
        for(int i= index; i< nums.length; i++){
            curr.add(nums[i]);
            bakctrack(list, curr,nums, i+1);
            curr.remove(curr.size()-1);
        }
    }
}