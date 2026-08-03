class Solution {
    private static final int[][] directions = {
        {1, 0}, 
        {-1, 0}, 
        {0, 1}, 
        {0, -1}
    };

    public boolean exist(char[][] board, String word) {
        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[0].length; c++){
                if(dfs(board, word, r, c, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int r, int c, int word_i){
        //Base Cases
        if(word_i == word.length()) return true;
        if(r < 0 || c < 0 || r >= board.length || c >= board[0].length) return false;
        if(board[r][c] == '*') return false;
        if(word.charAt(word_i) != board[r][c]) return false;
        
        char recordChar = board[r][c];
        board[r][c] = '*';
        boolean res = false;

        for(int[] dir : directions){
            if(dfs(board, word, r + dir[0], c + dir[1], word_i + 1)){
                res = true;
                break;
            }
        }

        board[r][c] = recordChar;
        return res;
    }
}
