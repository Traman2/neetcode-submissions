class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> charToCount = new HashMap<>();

        int left = 0;
        int max_count = 0;
        int answer = 0;

        for(int right = 0; right < s.length(); right++){
            charToCount.putIfAbsent(s.charAt(right), 0);
            charToCount.put(s.charAt(right), charToCount.get(s.charAt(right)) + 1);

            max_count = Math.max(max_count, charToCount.get(s.charAt(right)));

            while((right - left + 1) - max_count > k){
                charToCount.put(s.charAt(left), charToCount.get(s.charAt(left)) - 1);
                left++;
                
            }
            answer = Math.max(right - left + 1, answer);
        }

        return answer;
    }
}
