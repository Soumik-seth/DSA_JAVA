

public class NQueens {

    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];

        // initialize board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        solve(board, 0);
    }

    public static void solve(char[][] board, int row) {
        int n = board.length;

        // base case: all queens are placed
        if (row == n) {
            printBoard(board);
            System.out.println(); // gap between solutions
            return;
        }

        // try placing queen in every column of current row
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';     // place queen
                solve(board, row + 1);     // move to next row
                board[row][col] = '.';     // backtrack
            }
        }
    }

    public static boolean isSafe(char[][] board, int row, int col) {
        // check same column upward
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q')
                return false;
        }

        // check left diagonal
        int r = row, c = col;
        while (r >= 0 && c >= 0) {
            if (board[r][c] == 'Q')
                return false;
            r--;
            c--;
        }

        // check right diagonal
        r = row; 
        c = col;
        while (r >= 0 && c < board.length) {
            if (board[r][c] == 'Q')
                return false;
            r--;
            c++;
        }

        return true;
    }

    public static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}

