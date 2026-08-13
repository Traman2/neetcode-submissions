class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sCount = new HashMap<>();
        HashMap<Character, Integer> tCount = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            sCount.putIfAbsent(s.charAt(i), 0);
            Character get = s.charAt(i);
            sCount.put(s.charAt(i), sCount.get(get) + 1);
        }

        for(int i = 0; i < t.length(); i++){
            tCount.putIfAbsent(t.charAt(i), 0);
            tCount.put(t.charAt(i), tCount.get(t.charAt(i)) + 1);
        }

        return sCount.equals(tCount);
    }
}
