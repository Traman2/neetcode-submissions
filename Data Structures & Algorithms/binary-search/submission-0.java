class Solution {
    public int search(int[] nums, int target) {
        int min = 0;
        int max = nums.length - 1;
        for(int i = 0; i < nums.length; i++){
            int middle = (min + max) / 2;
            if(target == nums[middle]) return middle;
            else if(target > nums[middle]) min = middle + 1;
            else max = middle - 1; 
        }

        return -1;
    }
}
