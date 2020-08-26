
import javax.swing.*;
import java.awt.*;

public class View {

    private JFrame frame;
    private JPanel panel;
    private JLabel row1;
    private JLabel row2;
    private JLabel row3;
    private JLabel row4;
    private JLabel row5;
    public JButton OKButton;
    public JLabel enterRowLabel;
    public JLabel enterColLabel;
    public JTextField userRowEntry;
    public JTextField userColEntry;
    private JLabel loseMessage;
    private JLabel gameOverMessage;

    public View() {
        frame = new JFrame();
        panel = new JPanel();
        userRowEntry = new JTextField(10);
        userColEntry = new JTextField();
        OKButton = new JButton("OK");

        frame.setTitle("Battleships");
        frame.setSize(300, 300);
        panel.setSize(300, 300);

        frame.add(panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void displayBoard(char[][] board) {
        row1 = new JLabel(String.valueOf(board[0]));
        row2 = new JLabel(String.valueOf(board[1]));
        row3 = new JLabel(String.valueOf(board[2]));
        row4 = new JLabel(String.valueOf(board[3]));
        row5 = new JLabel(String.valueOf(board[4]));

        panel.add(row1);
        panel.add(row2);
        panel.add(row3);
        panel.add(row4);
        panel.add(row5);
    }

    public void forgetBoard(char[][] board) {
        panel.remove(row1);
        panel.remove(row2);
        panel.remove(row3);
        panel.remove(row4);
        panel.remove(row5);
    }

    public void displayInputFields() {
        enterRowLabel = new JLabel("Enter Row");
        panel.add(enterRowLabel);

        Dimension d = userRowEntry.getPreferredSize();
        userRowEntry.setMaximumSize(new Dimension(200, d.height));
        panel.add(userRowEntry);

        enterColLabel = new JLabel("Enter Column");
        panel.add(enterColLabel);

        Dimension dim = userColEntry.getPreferredSize();
        userColEntry.setMaximumSize(new Dimension(200, dim.height));
        panel.add(userColEntry);

        panel.add(OKButton);
    }

    public void displayWinMessage() {
        JLabel winMessage = new JLabel("You hit the ship!");
        panel.add(winMessage);
    }

    public void displayLoseMessage() {
        loseMessage = new JLabel("You missed!");
        panel.add(loseMessage);
    }

    public void displayGameOverMessage() {
        gameOverMessage = new JLabel("Game Over!");
        panel.add(gameOverMessage);
    }
    public void forgetInputFields() {
        panel.remove(enterRowLabel);
        panel.remove(enterColLabel);
        panel.remove(userRowEntry);
        panel.remove(userColEntry);
        panel.remove(OKButton);
    }

    public void forgetLoseMessage() {
        panel.remove(loseMessage);
    }
}
