package hsush2017.code_wars.kyu5;

// https://www.codewars.com/kata/525caa5c1bf619d28c000335
public class TicTacToeChecker {
    public int isSolved(int[][] board) {
        if (board[0][0] > 0 && (board[0][0] == board[0][1] && board[0][1] == board[0][2])) {
            return board[0][0];
        }

        if (board[1][0] > 0 && (board[1][0] == board[1][1] && board[1][1] == board[1][2])) {
            return board[1][0];
        }

        if (board[2][0] > 0 && (board[2][0] == board[2][1] && board[2][1] == board[2][2])) {
            return board[2][0];
        }

        if (board[0][0] > 0 && (board[0][0] == board[1][0] && board[1][0] == board[2][0])) {
            return board[0][0];
        }

        if (board[0][1] > 0 && (board[0][1] == board[1][1] && board[1][1] == board[2][1])) {
            return board[0][1];
        }

        if (board[0][2] > 0 && (board[0][2] == board[1][2] && board[1][2] == board[2][2])) {
            return board[0][2];
        }

        if (board[0][0] > 0 && (board[0][0] == board[1][1] && board[1][1] == board[2][2])) {
            return board[0][0];
        }

        if (board[2][0] > 0 && (board[2][0] == board[1][1] && board[1][1] == board[0][2])) {
            return board[2][0];
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 0) {
                    return -1;
                }
            }
        }

        return 0;
    }
}
