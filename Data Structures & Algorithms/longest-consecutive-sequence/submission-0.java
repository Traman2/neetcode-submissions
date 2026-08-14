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
                max = Math.max(max, trailSeq(nums[i], dict));
            }
        }

        return max;
    }

    private int trailSeq(int num, Set<Integer> dict){
        System.out.println("Called: " + num);
        int result = 0;

        while(dict.contains(num)){
            num += 1;
            result++;
        } 

        return result;
    }
}
