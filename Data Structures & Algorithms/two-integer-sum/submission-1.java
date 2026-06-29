class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> contains = new HashMap<>(); //int nums, Index
        for(int i = 0; i < nums.length; i++) contains.put(nums[i], i);

        for(int i = 0; i < nums.length; i++) {
            if(contains.get(target - nums[i]) != null){
                if(contains.get(target - nums[i]) != i){
                    return new int[] {i, contains.get(target - nums[i])};
                }
            }
           
        }
        return new int[] {-1, -1}; //should not run

    }
}
