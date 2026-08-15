class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> dict = new HashSet<>();
        int left = 0;
        int max = 0;

        for(int right = 0; right < s.length(); right++){
            while(dict.contains(s.charAt(right))){
                dict.remove(s.charAt(left));
                left++;
            }

            dict.add(s.charAt(right));
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
