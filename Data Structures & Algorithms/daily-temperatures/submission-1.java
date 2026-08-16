class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        
        for(int left = 0; left < temperatures.length; left++){
            int days = 0;
            boolean found = false;
            for(int right = left + 1; right < temperatures.length; right++){
                days++;
                if(temperatures[right] > temperatures[left]){
                    found = true;
                    break;
                } 
                
            }
            res[left] = found ? days : 0;
        }

        return res;
    }
}
