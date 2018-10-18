class Solution {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			if (hm.get(target - num) != null) return new int[]{hm.get(target - num), i};
			hm.put(num, i);
		}
		return null;
	}
}