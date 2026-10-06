
public class NQueens {

    public static void main(String[] args) {

        int n=8;
        boolean[][] board=new boolean[n][n];
        nQueens(board, 0);
    }
    static int nQueens(boolean[][] board, int r) {
        if (r == board.length) {
            display(board);
            System.out.println();
            return 1;
        }

        //placing the queen for every row and column
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            //place the queen if it is safe 
            if (isSafe(board, r, col)) {
                board[r][col]=true;
                count+=nQueens(board, r+1);
                board[r][col]=false;
            }
        }
        return count;
    }

    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    static  boolean isSafe(boolean [][] board,int r,int col){
        //cheak virtical row 

        for (int i = 0; i < r; i++) {
           if(board[i][col]){
            return false;
           } 
        }
        //diagonal left
        int maxLeft = Math.min(r, col);
        for (int i = 1; i <=maxLeft; i++){
            if(board[r-i][col-i]){
                return false;
            }
        }

        //diagonal right

        int maxRight = Math.min(r, board.length-col-1);
        for (int i = 1; i <=maxRight; i++){
            if(board[r-i][col+i]){
                return false;
            }
        }
        return true;
    }
}
