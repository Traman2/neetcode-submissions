class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numberToIndex = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(numberToIndex.containsKey(target - nums[i])) return new int[] { numberToIndex.get(target - nums[i]), i};

            numberToIndex.put(nums[i], i);
        }

        return new int[] {-1, -1}; //Should not run

    }
}
