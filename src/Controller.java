public class Controller {

    Model model = new Model();
    View view = new View();

    public void displayBoard() {
        char[][] board = model.initialiseBoard();
        view.displayBoard(board);
    }

    public void displayInputFields() {
        view.displayInputFields();
    }

    public int battleshipRow() {
        int row = model.battleshipRow();
        return row;
    }

    public int battleshipCol() {
        int col = model.battleshipRow();
        return col;
    }
}

