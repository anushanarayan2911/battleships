import java.util.Random;

public class Model {

    private char[][] board = new char[5][5];

    public char[][] initialiseBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'O';
            }
        }
        return board;
    }

    public int battleshipRow() {
        Random r = new Random();
        return r.nextInt(4) + 1;
    }

    public int battleshipCol() {
        Random r = new Random();
        return r.nextInt(4) + 1;
    }

    public char[][] updateBoard(int x, int y, char character) {
        board[x - 1][y - 1] = character;
        return board;
    }

}
