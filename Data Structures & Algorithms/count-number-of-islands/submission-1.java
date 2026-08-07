class Solution {
    private int[][] directions = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};
    
    public int numIslands(char[][] grid) {
        int answer = 0;

        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[0].length; c++){
                if(grid[r][c] == '1'){
                    dfs(grid, r, c);
                    answer++;
                }
            }
        }

        return answer;
    }

    private void dfs(char[][] grid, int r, int c){
        if(r < 0 || c < 0) return;
        if(r >= grid.length || c >= grid[0].length) return;
        if(grid[r][c] == '0') return;

        grid[r][c] = '0';

        for(int dir[] : directions){
            dfs(grid, r + dir[0], c + dir[1]);
        }

    }
}
