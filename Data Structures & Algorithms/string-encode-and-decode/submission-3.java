class Solution {

    public String encode(List<String> strs) {
        String encodedString = "";
        for(int i = 0; i < strs.size(); i++){
            encodedString += strs.get(i).length() + "#" + strs.get(i);
        }
        System.out.println(encodedString);
        return encodedString;
    }

    public List<String> decode(String str) {
        if(str.isEmpty()) return new ArrayList<>();
        /* First char is number of length
         * Second char is # seperator
         */
        List<String> answer = new ArrayList<>();
        int indexOfArr = 0;
        int stringSize = 0;
        boolean trackInteger = true;
        answer.add(new String());

        for(int i = 0; i < str.length(); i++){
            String currentChar = str.substring(i, i+1);
            
            if(currentChar.equals("#") && trackInteger){
                trackInteger = false;
            }
            else if(trackInteger){
                stringSize *= 10;
                stringSize += Integer.parseInt(currentChar);
            }
            else if(stringSize > 0){
                answer.set(indexOfArr, answer.get(indexOfArr) + currentChar);
                stringSize--;
            }
            else {
                indexOfArr++;
                answer.add(new String());
                stringSize = 0;
                trackInteger = true;
                i--;
            }
        }

        return answer;
    }
}
