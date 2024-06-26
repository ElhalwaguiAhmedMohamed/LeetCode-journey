class Solution {
    public static Deque<Integer> cleanUp(int i, Deque<Integer> currentWindow, int[] nums) {
		while (currentWindow.size() != 0 && nums[i] >= nums[currentWindow.getLast()]) {
			currentWindow.removeLast();
		}
		return currentWindow;
	}
    public int[] maxSlidingWindow(int[] nums, int w) {
        if(nums.length == 1)
			return nums;
		int[] output = new int[nums.length - w + 1];
		Deque<Integer> currentWindow = new ArrayDeque<>();
		for(int i = 0; i < w; i++){
			currentWindow = Solution.cleanUp(i, currentWindow, nums);
			currentWindow.add(i);
		}
			output[0] = nums[currentWindow.getFirst()];
		for (int i = w; i < nums.length; i++) {
			cleanUp(i, currentWindow, nums);
			if (!currentWindow.isEmpty() && currentWindow.getFirst() <= (i - w)) {
				currentWindow.removeFirst();
			}
			currentWindow.add(i);
			output[i - w + 1] = nums[currentWindow.getFirst()];
		}
		return output;
    }
}