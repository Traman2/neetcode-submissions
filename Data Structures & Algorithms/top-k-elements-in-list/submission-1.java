class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numberToCount = new HashMap<>();

        for(int num: nums){
            numberToCount.putIfAbsent(num, 0);
            numberToCount.put(num, numberToCount.get(num) + 1);
        }

        //Implement bucket sort for sorting
        List<List<Integer>> bucket = new ArrayList<>();
        for(int i = 0; i <= nums.length; i++){
            bucket.add(new ArrayList<>());
        }

        for(Integer number : numberToCount.keySet()){
            bucket.get(numberToCount.get(number)).add(number);
        }

        //Now populate answer array
        int[] answer = new int[k];
        int index = 0;
        for(int i = nums.length; i >= 0 && index < k; i--){
            for(int freq : bucket.get(i)){
                answer[index] = freq;
                index++;
                if(index == k) break;
            }
        }

        return answer;
    }
}
