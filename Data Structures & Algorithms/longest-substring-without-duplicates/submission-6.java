class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        Set<Character> dict = new HashSet<>();

        int left = 0;

        for(int i = 0; i < s.length(); i++){
            while(dict.contains(s.charAt(i))){
                dict.remove(s.charAt(left));
                left++;
            }
            
            longest = Math.max(longest, i - left + 1);
            dict.add(s.charAt(i));
            
        }

        return longest;
    }
}
