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
        if(word.length() == word_i) return true;
        if(r < 0 || c < 0 || r >= board.length || c >= board[0].length) return false;
        if(board[r][c] != word.charAt(word_i)) return false;

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
