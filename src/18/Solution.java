class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Map<Integer, List<int[]>> map = new HashMap<Integer, List<int[]>>();
        Set<List<Integer>> result = new HashSet<List<Integer>>();
        
        for (int i = 0; i < nums.length; i++) {
            if (i > 1 && nums[i] == nums[i - 2]) continue;
            for (int j = i + 1; j < nums.length; j++) {
                if (j > i + 2 && nums[j] == nums[j - 2]) continue;

                if (map.containsKey(target - (nums[i] + nums[j]))) {   
        	        List<int[]> sumList = map.get(target - (nums[i] + nums[j]));
        	        for (int[] pair : sumList) {
                        int small = Math.min(pair[1], j); 
                        int large = Math.max(pair[1], j); 
                    
                        if (pair[0] == i || pair[0] == large || small == i || small == large) continue;
 		                result.add(Arrays.asList(nums[pair[0]], nums[Math.min(small, i)], nums[Math.max(small, i)], nums[large]));
        	        }
                }
                
                List<int[]> list = map.get(nums[i] + nums[j]);
                if (list == null) {
                    list = new ArrayList<int[]>();
                    list.add(new int[]{i, j});
                    map.put(nums[i] + nums[j], list);
                }
                else {
                    list.add(new int[]{i, j});
                }
            }
        }
        return new ArrayList<List<Integer>>(result);
    }
}