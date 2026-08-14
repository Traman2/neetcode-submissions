class Solution {
    
    
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> dict = new HashSet<>();

        for(int num: nums){
            dict.add(num);
        }

        int max = 0;

        for(int i = 0; i < nums.length; i++){
            if(!dict.contains(nums[i] - 1)){
                //At start
                int result = 0;

                while(dict.contains(nums[i] + result)){
                    result++;
                }
                max = Math.max(max, result);
            }
        }

        return max;
    }

}
