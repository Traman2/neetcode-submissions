class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> checked = new HashMap<>(); //Number to index

        for(int i = 0; i < nums.length; i++){
            checked.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            if(checked.containsKey(target - nums[i]) && checked.get(target -  nums[i]) != i) return new int[] {i, checked.get(target -  nums[i])};
        }

        return new int[] {}; //SHOULD NOT RUN
    }
}
