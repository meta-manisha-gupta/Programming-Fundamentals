/**
 * 
 * Class name-NQueensProblem
 * 
 * version 1.0
 * @author Manisha Gupta
 *
 */
public class NQueensProblem {
    /**
     * This is function to check if a queen can be placed on board[row][col] or not?
     * This is checking only left side for attacking queens.
     * @param board
     * @param row
     * @param col
     * @param dimension
     * @return -returns true if queen can be safely placed and otherwise  returns false.
     */
    public boolean checkCorrectPlaceOrNot(int board[][], int row, int col, int dimension){
        int i,j;
        //Check same row in left side.
        for(i = 0; i < col; i++){                        
            if(board[row][i] == 1){
                return false;
            }
        }
        //Check Top left Diagonal in left side
        for(i = row, j = col; i >=0 && j >=0; i--, j--){
            if(board[i][j] == 1){
                return false;
            }
        }
        //Check Bottom left Diagonal in left side.
        for(i = row, j = col; j >=0 && i > dimension; i++, j--){
            if(board[i][j] == 1){
                return false;
            }
        }
        return true;
        
    }
    /**
     * This function solves the N Queen problem using backtracking.
     * 1. if all queens are placed return true.
     * 2. Try all rows in the same column to place the queen.
     * 3. Place the Queen in board[i][col].
     * 4. Try to place rest of the queens.
     * 5. if placing of Queen in board[i][col] is not correct, remove the Queen from board[i][col].
     * @param board
     * @param col
     * @param dimension
     * @return -returns false if Queens can not be placed otherwise returns true
     * 
     */
    public boolean boardSolver(int board[][], int col, int dimension){
        if(col >= dimension){                
            return true;
        }
        for(int i = 0; i < dimension; i++){
            if(checkCorrectPlaceOrNot(board, i, col, dimension)){
                board[i][col] = 1;
                if(boardSolver(board, col+1, dimension)){
                    return true;
                }
                board[i][col] = 0;
            }
        }
        
        return false;
    }
}
