class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();
        
        for(int left = 0; left < temperatures.length; left++){
            // int days = 0;
            // boolean found = false;
            // for(int right = left + 1; right < temperatures.length; right++){
            //     days++;
            //     if(temperatures[right] > temperatures[left]){
            //         found = true;
            //         break;
            //     } 
                
            // }
            // res[left] = found ? days : 0;

            int t = temperatures[left];
            while(!stack.isEmpty() && t > stack.peek()[0]){
                int[] pair = stack.pop();

                res[pair[1]] = left - pair[1];
            }
            stack.push(new int[]{t, left});
        }

        return res;
    }
}
