class Solution {

    public String encode(List<String> strs) {
        StringBuilder output = new StringBuilder();

        for(String str: strs){
            output.append(str.length()).append('/').append(str);
        }

        return output.toString();
    }

    public List<String> decode(String str) {
        List<String> output = new ArrayList<>();

        int l = 0;
        while(l < str.length()){
            int r = l;
            while(str.charAt(r) != '/') r++;

            int stringLength = Integer.parseInt(str.substring(l, r));

            int start = r + 1;
            int end = r + stringLength + 1;
            output.add(str.substring(start, end));

            l = end;
        }


        return output;
    }
}
