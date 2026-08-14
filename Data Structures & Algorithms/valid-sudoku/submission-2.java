class Solution {
    public boolean isValidSudoku(char[][] board) {
        final int BOARD_SIZE = 9;
        final int BOX_SIZE = 3;

        //Box check
        int box_r = 1;
        int box_c = 1;

        for(int i = 0; i < 9; i++){
            HashSet<Character> seen = new HashSet<>();
            for(int r = BOX_SIZE * (box_r - 1); r < BOX_SIZE * box_r; r++){
                for(int c = BOX_SIZE * (box_c - 1); c < BOX_SIZE * box_c; c++){
                    if(board[r][c] == '.') continue;
                    if(seen.contains(board[r][c])) return false;
                    seen.add(board[r][c]);
                }
            }
            seen = new HashSet<>();

            if(box_r != 3) box_r++;
            else if(box_c != 3){
               box_c++;
               box_r = 1;
            } 
        }
        

        //Row check
        for(int r = 0; r < board.length; r++){
            HashSet<Character> seen = new HashSet<>();
            for(int c = 0; c < board[0].length; c++){
                if(board[r][c] == '.') continue;
                if(seen.contains(board[r][c])) return false;
                seen.add(board[r][c]);
            }

            seen = new HashSet<>();
        }


        //Col check
        for(int c = 0; c < board[0].length; c++){
            HashSet<Character> seen = new HashSet<>();
            for(int r = 0; r < board.length; r++){
                if(board[r][c] == '.') continue;
                if(seen.contains(board[r][c])) return false;
                seen.add(board[r][c]);
            }

            seen = new HashSet<>();
        }


        return true;
    }
}
