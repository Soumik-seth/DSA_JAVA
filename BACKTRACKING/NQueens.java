package DSA_JAVA.BACKTRACKING;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean board[][] = new boolean[n][n];
        System.out.println("Total solutions: " + queen(board, 0));
    }

    static int queen(boolean board[][], int row) {
        if (row == board.length) {
            display(board);
            return 1;
        }

        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += queen(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    static boolean isSafe(boolean board[][], int row, int col) {

        // check vertically up
        for (int i = 0; i < row; i++) {
            if (board[i][col]) return false;
        }

        // check left diagonal
        int minLeft = Math.min(row, col);
        for (int i = 1; i <= minLeft; i++) {
            if (board[row - i][col - i]) return false;
        }

        // check right diagonal
        int minRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= minRight; i++) {
            if (board[row - i][col + i]) return false;
        }

        return true;
    }

    static void display(boolean board[][]) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element)
                    System.out.print("Q ");
                else
                    System.out.print("X ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
