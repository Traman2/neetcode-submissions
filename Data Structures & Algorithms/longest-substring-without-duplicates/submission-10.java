class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> dict = new HashMap<>();
        int left = 0;
        int max = 0;

        for(int right = 0; right < s.length(); right++){
            if(dict.containsKey(s.charAt(right))) {
                left = Math.max(dict.get(s.charAt(right)) + 1, left);
            }

            dict.put(s.charAt(right), right);
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
