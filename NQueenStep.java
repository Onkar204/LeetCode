class NQueenStep {

    int N = 4;

    void printBoard(char board[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    boolean isSafe(char board[][], int row, int col) {

        // Check column
        for (int i = 0; i < row; i++)
            if (board[i][col] == 'Q')
                return false;

        // Check left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q')
                return false;

        // Check right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < N; i--, j++)
            if (board[i][j] == 'Q')
                return false;

        return true;
    }

    boolean solveNQUtil(char board[][], int row) {

        if (row == N) {
            System.out.println("Solution Found:");
            printBoard(board);
            return true; // stop after first solution
        }

        for (int col = 0; col < N; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';

                System.out.println("Placed Queen at Row " + row + " Col " + col);
                printBoard(board);

                if (solveNQUtil(board, row + 1))
                    return true;

                // Backtracking
                board[row][col] = '.';
                System.out.println("Backtracking from Row " + row + " Col " + col);
                printBoard(board);
            }
        }
        return false;
    }

    void solveNQ() {
        char board[][] = new char[N][N];

        // Initialize board
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                board[i][j] = '.';

        solveNQUtil(board, 0);
    }

    public static void main(String args[]) {
        NQueenStep obj = new NQueenStep();
        obj.solveNQ();
    }
}