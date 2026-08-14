public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        /**
         * First build run through each strs element
         * Then sort strs element in alpha order
         * Then use that as key to insert sorted word to original word
         * Then return hash values back
         */
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for(String str: strs){
            char[] strChar = str.toCharArray();
            Arrays.sort(strChar);
            String sorted = new String(strChar);

            map.putIfAbsent(sorted, new ArrayList<>());
            map.get(sorted).add(str);
        }

        return new ArrayList<>(map.values());
    }
}