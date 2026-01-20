import java.util.Random;

public class TicTacToe {
    public static void main(String[] args) {

        char[][] board = new char[3][3];
        Random rand = new Random();

        // part 1
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (rand.nextInt(2) == 0) {
                    board[r][c] = 'X';
                } else {
                    board[r][c] = 'O';
                }
            }
        }

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }

        // part 2
        char winner = ' ';

        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                winner = board[i][0];
            }
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                winner = board[0][i];
            }
        }

        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            winner = board[0][0];
        }

        if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            winner = board[0][2];
        }

        if (winner == 'X') {
            System.out.println("X wins");
        } else if (winner == 'O') {
            System.out.println("O wins");
        } else {
            System.out.println("Cat's game");
        }
    }
}
