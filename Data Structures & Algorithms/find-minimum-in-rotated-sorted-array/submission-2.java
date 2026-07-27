class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while(l < r){
            int mid = l + (r - l) / 2;

            if(nums[mid] < nums[r]){
                //In the increasing portion, navigate right
                r = mid;
            }
            else {
                //In pivot location, now triangulate to start
                l = mid + 1;
            }
        }

        return nums[l];
    }
}
