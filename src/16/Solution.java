class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int curr = nums[i] + nums[j] + nums[k];
                if (Math.abs(curr - target) < Math.abs(result - target)) {
                    result = curr;
                }
                if (curr > target) k--;
                else j++;
            }
        }
        return result;
    }
}