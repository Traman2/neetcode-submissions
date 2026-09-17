class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numToIndex = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            numToIndex.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            if(numToIndex.get(target - nums[i]) != null && numToIndex.get(target - nums[i]) != i) return new int[] {i, numToIndex.get(target - nums[i])};
        }

        return new int[] {-1, -1};

    }
}
