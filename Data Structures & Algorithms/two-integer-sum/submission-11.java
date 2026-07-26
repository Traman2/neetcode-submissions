class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> checked = new HashMap<>(); //Number to index

        for(int i = 0; i < nums.length; i++){
            int compliment = target - nums[i];
            if(checked.containsKey(compliment)) 
                return new int[] {checked.get(compliment), i};
            checked.put(nums[i], i);
        }

        return new int[] {}; //SHOULD NOT RUN
    }
}
