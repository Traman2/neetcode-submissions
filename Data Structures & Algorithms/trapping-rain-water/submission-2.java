class Solution {
    public int trap(int[] height) {
        /**
         Need height on left and right

         */
        if (height.length == 0) return 0;

        int[] prefix = new int[height.length];
        int[] sufix = new int[height.length];

        prefix[0] = height[0];
        for(int i = 1; i < height.length; i++){
            prefix[i] = Math.max(height[i], prefix[i - 1]);
        }

        sufix[height.length - 1] = height[height.length - 1];
        for(int i = height.length - 2; i >= 0; i--){
            sufix[i] = Math.max(height[i], sufix[i + 1]);
        }
        
        int res = 0;
        for(int i = 0; i < height.length; i++){
            res += Math.min(sufix[i], prefix[i]) - height[i];
        }
        return res;
    }
}
