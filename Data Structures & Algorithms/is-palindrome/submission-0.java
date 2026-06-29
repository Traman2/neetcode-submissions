class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int begin = 0;
        int end = s.length() - 1;
        for(int i = 0; i < s.length(); i++) {
            if(begin == end) break;
            System.out.println(i + " char: " + (s.charAt(end)));
            System.out.println(i + " char: " + s.charAt(begin));
            if((s.charAt(begin) != (s.charAt(end)))) return false;
            begin++;
            end--;
        }
        return true;
    }
}
