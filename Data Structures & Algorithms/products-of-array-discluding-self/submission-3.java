class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        //prefix
        int[] prefix = new int[n];
        prefix[0] = 1;

        for(int i = 1; i < n; i++){
            prefix[i] = nums[i - 1] * prefix[i - 1];
        }

        //postfix
        int[] postfix = new int[n];
        postfix[n - 1] = 1;

        for(int i = n - 2; i >= 0; i--){
            postfix[i] = nums[i + 1] * postfix[i + 1];
        }

        for(int i = 0; i < n; i++){
            nums[i] = prefix[i] * postfix[i];
        }

        return nums;
    }
}  
