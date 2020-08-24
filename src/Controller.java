import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener{

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        this.view.OKButton.addActionListener(this);
    }

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

    @Override
    public void actionPerformed(ActionEvent e) {
        String userRow = view.userRowEntry.getText();
        String userCol = view.userColEntry.getText();
    }
}

