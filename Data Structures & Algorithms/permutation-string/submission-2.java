class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int windowSize = s1.length();

        int[] s1Freq = new int[26];
        int[] s2Freq = new int[26];

        for(char s1Char : s1.toCharArray()){
            s1Freq[s1Char - 'a'] ++;
        }

        for(int right = 0; right < s2.length(); right++) {
            s2Freq[s2.charAt(right) - 'a'] ++;

            int left = right - windowSize;
            if (left >= 0) {
                s2Freq[s2.charAt(left) - 'a']--;
            }

            if(Arrays.equals(s1Freq, s2Freq)) return true;
        }

        return false;
        
    }
}
