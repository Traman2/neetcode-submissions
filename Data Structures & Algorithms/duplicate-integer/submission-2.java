class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> test = new HashSet();
        //test.add(nums[0]);
        for(int i = 0; i < nums.length; i++){
            if(test.contains(nums[i])) return true;
            System.out.println(test.contains(nums[i]));
            test.add(nums[i]);
        }
        
        return false;

 
    }
}