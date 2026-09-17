public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        /**
         * 
         */
        HashMap<String, List<String>> canonicalToWords = new HashMap<>();

        for(String str : strs){
            String key = canonicalForm(str);
            canonicalToWords.putIfAbsent(key, new ArrayList<String>());
            canonicalToWords.get(key).add(str);
        }

        return new ArrayList(canonicalToWords.values());
        
    }

    private static String canonicalForm(String str){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}