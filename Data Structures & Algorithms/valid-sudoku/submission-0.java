class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row=0; row<9; row++){

            for(int col=0; col<9; col++){
                char ele = board[row][col];
                int count = 0;
                if(ele == '.') continue;
                for(int i=col+1;i<9; i++){
                    if(ele == board[row][i]){
                        count++;
                    }
                    if(count > 0) return false;
                }

                count =0;
                for(int i=row+1; i<9; i++){
                    if(ele == board[i][col]){
                        count++;
                    }
                    if(count > 0) return false;
                }

                count = 0;
                int boxrow = (row/3)*3;
                int boxcol = (col/3)*3;
                for(int i=boxrow; i<boxrow+3; i++){
                    for(int j=boxcol; j<boxcol+3; j++){
                        if(ele == board[i][j]) count++;
                        if(count > 1) return false;
                    }
                }

            }

        }
        return true;
    }
}
