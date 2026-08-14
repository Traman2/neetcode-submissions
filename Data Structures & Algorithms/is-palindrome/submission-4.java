class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder alphaS = new StringBuilder();

        for(char c : s.toCharArray()){
            System.out.println(alphaChar(c) + "" + c);
            if(alphaChar(c)) alphaS.append(c);
        }

        // Core algrothim
        int l = 0;
        int r = alphaS.length() - 1;

        String alphaSLowered = alphaS.toString().toLowerCase();

        while(l < r){
            if(alphaSLowered.charAt(l) != alphaSLowered.charAt(r)) return false;
            l++;
            r--;
        }

        return true;
    }

    private boolean alphaChar(char s) {
        return s >= 'a' && s <= 'z' ||
               s >= 'A' && s <= 'Z' ||
               s >= '0' && s <= '9';
    }
}
