class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        

        for(int i = 0; i < nums.length; i++){
            // Can only be positive from here, break
            if(nums[i] > 0) break;

            // Skip dup cases
            if(i >= 1 && nums[i] == nums[i - 1]) continue;

            // Just like 2Sum 2
            int left = i + 1;
            int right = nums.length - 1;

            while(left < right){
                int curSum = nums[i] + nums[left] + nums[right];

                if(curSum < 0) left++;
                else if(curSum > 0) right--;
                else {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    //skip next left dups
                    while(left < right && nums[left] == nums[left - 1]){
                        left++;
                    }
                }
            }
        }

        return ans;
    }
}
