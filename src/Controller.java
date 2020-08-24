import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener{

    private Model model;
    private View view;
    private String userRowEntry;
    private String userColEntry;
    private int shipRow;
    private int shipCol;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        this.view.OKButton.addActionListener(this);
        shipRow = model.battleshipRow();
        shipCol = model.battleshipCol();
    }

    public void displayBoard() {
        char[][] board = model.initialiseBoard();
        view.displayBoard(board);
    }

    public void displayInputFields() {
        view.displayInputFields();
        System.out.println(shipRow);
        System.out.println(shipCol);
    }

    public void compareValues(String x, String y) {
        int userRow = Integer.parseInt(x);
        int userCol = Integer.parseInt(y);

        if (userRow == shipRow && userCol == shipCol) {
            view.forgetInputFields();
            view.displayWinMessage();
        } else {
            view.displayLoseMessage();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        userRowEntry = view.userRowEntry.getText();
        userColEntry = view.userColEntry.getText();

        compareValues(userRowEntry, userColEntry);
    }
}

