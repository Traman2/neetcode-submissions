class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> dict = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(dict.contains(nums[i])) return true;
            dict.add(nums[i]);
        }

        return false;
    }
}