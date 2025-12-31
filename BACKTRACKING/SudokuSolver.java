package BACKTRACKING;
public class SudokuSolver {

    public static void main(String[] args) {

        int[][] board = {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0},
        };

        if (solve(board)) {
            printBoard(board);
        } else {
            System.out.println("No solution exists");
        }
    }

    static boolean solve(int[][] board) {

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                if (board[row][col] == 0) {   // Empty cell found
                    for (int num = 1; num <= 9; num++) {

                        if (isSafe(board, row, col, num)) {
                            board[row][col] = num;

                            if (solve(board)) return true;

                            board[row][col] = 0;  // Backtrack
                        }
                    }
                    return false;
                }
            }
        }
        return true; // Solved
    }

    static boolean isSafe(int[][] board, int row, int col, int num) {

        // Check row
        for (int i = 0; i < 9; i++)
            if (board[row][i] == num)
                return false;

        // Check column
        for (int i = 0; i < 9; i++)
            if (board[i][col] == num)
                return false;

        // Check 3x3 box
        int startRow = row - row % 3;
        int startCol = col - col % 3;

        for (int i = startRow; i < startRow + 3; i++)
            for (int j = startCol; j < startCol + 3; j++)
                if (board[i][j] == num)
                    return false;

        return true;
    }

    static void printBoard(int[][] board) {
        for (int r = 0; r < 9; r++) {
            if (r % 3 == 0 && r != 0)
                System.out.println("-----------+-----------+-----------");

            for (int c = 0; c < 9; c++) {
                if (c % 3 == 0 && c != 0)
                    System.out.print(" | ");

                System.out.print(" " + board[r][c] + " ");
            }
            System.out.println();
        }
    }
}
