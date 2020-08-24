import java.util.Random;

public class Model {

    public char[][] initialiseBoard() {
        char[][] board = new char[5][5];
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

}
