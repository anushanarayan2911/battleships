import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener{

    private Model model;
    private View view;
    private String userRowEntry;
    private String userColEntry;
    private int shipRow;
    private int shipCol;
    private char[][] board;
    private int counter = 0;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        this.view.OKButton.addActionListener(this);
        shipRow = model.battleshipRow();
        shipCol = model.battleshipCol();
    }

    public void initialiseBoard() {
        board = model.initialiseBoard();
        view.displayBoard(board);
    }

    public void updateBoard(int x, int y, char character) {
        view.forgetBoard(board);
        board = model.updateBoard(x, y, character);
        view.displayBoard(board);
    }

    public void displayInputFields() {
        view.displayInputFields();
    }

    public void compareValues(String x, String y) {
        int userRow = Integer.parseInt(x);
        int userCol = Integer.parseInt(y);

        if (userRow == shipRow && userCol == shipCol) {
            view.forgetInputFields();
            view.forgetLoseMessage();
            view.displayWinMessage();
            updateBoard(userRow, userCol, 'Y');
        } else {
            counter += 1;
            if (counter == 5) {
                view.displayGameOverMessage();
                view.forgetInputFields();
            } else {
                view.displayLoseMessage();
                updateBoard(userRow, userCol, 'X');
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        userRowEntry = view.userRowEntry.getText();
        userColEntry = view.userColEntry.getText();

        compareValues(userRowEntry, userColEntry);
    }
}

