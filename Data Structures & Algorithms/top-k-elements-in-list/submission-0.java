class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        
        for(int num : nums){
            counts.putIfAbsent(num, 0);
            counts.put(num, counts.get(num) + 1);
        }

        List<Map.Entry<Integer, Integer>> sorted = new ArrayList<>(counts.entrySet());
        sorted.sort((a, b) -> b.getValue() - a.getValue());
        
        
        int[] answer = new int[k];
        for(int i = 0; i < k; i++){
            answer[i] = sorted.get(i).getKey();
        }

        return answer;
    }
}
