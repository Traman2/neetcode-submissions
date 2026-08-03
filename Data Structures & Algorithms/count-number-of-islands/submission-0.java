class Solution {
    private static final int[][] directions = {
        {1, 0}, 
        {-1, 0}, 
        {0, 1}, 
        {0, -1}
    };

    public int numIslands(char[][] grid) {
        int islands = 0;

        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[0].length; c++){
                if(grid[r][c] == '1'){
                    dfs(grid, r, c);
                    islands++;
                } 
            }
        }

        return islands;
    }

    private void dfs(char[][] grid, int r, int c){
        Stack<int[]> current = new Stack<>();
        
        current.push(new int[]{r, c});
        while(!current.isEmpty()){
            int[] curLocation = current.pop();
            int curR = curLocation[0];
            int curC = curLocation[1];

            if(curR < 0 || curC < 0 || curR >= grid.length || 
            curC >= grid[0].length || grid[curR][curC] == '0') continue;

            grid[curR][curC] = '0';
            for(int[] dir : directions){
                current.push(new int[]{curR + dir[0], curC + dir[1]});
            }
        }
    }
}
