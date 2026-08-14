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
                max = Math.max(max, seq(nums[i], dict));
            }
        }

        return max;
    }

    private int seq(int num, Set<Integer> dict){
        int length = 0;

        while(dict.contains(num)){
            length++;
            num++;
        }

        return length;
    }

}
