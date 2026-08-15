class Solution {
    public int maxArea(int[] heights) {
        // int max = 0;

        // for(int i = 0; i < heights.length; i++){
        //     for(int j = 0; j < heights.length; j++){
        //         max = Math.max(max, Math.min(heights[j], heights[i]) * (j - i));
        //     }
        // }

        // return max;

        int left = 0;
        int right = heights.length - 1;
        int res = 0;

        while(left < right){
            int area = Math.min(heights[left], heights[right]) * (right - left);

            res = Math.max(res, area);

            if(heights[left] > heights[right]) right--;
            else left++;
        }

        return res;
    }
}
