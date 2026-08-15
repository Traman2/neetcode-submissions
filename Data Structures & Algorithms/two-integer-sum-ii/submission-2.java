class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        for(int i = 0; i < numbers.length; i++){
            int curSum = numbers[left] + numbers[right];

            if(curSum < target) {
                left++;
            }
            else if(curSum > target) {
                right--;
            }
            else {
                return new int[] {left + 1, right + 1};
            }
        }

        return new int[] {-1, -1};
    }
}
