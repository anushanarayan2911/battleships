import jdk.internal.jimage.ImageStrings;

import javax.swing.*;
import java.awt.*;

public class View {

    private JFrame frame;
    private JPanel panel;
    public JButton OKButton;
    public JTextField userRowEntry;
    public JTextField userColEntry;

    public View() {
        frame = new JFrame();
        panel = new JPanel();
        userRowEntry = new JTextField(10);
        userColEntry = new JTextField();
        OKButton = new JButton("OK");

        frame.setTitle("Battleships");
        frame.setSize(300, 300);

        frame.add(panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void displayBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            JLabel row = new JLabel(String.valueOf(board[i]));
            int y = 10 * i;
            row.setBounds(10, y, 5, 5);
            panel.add(row);
        }
    }

    public void displayInputFields() {
        JLabel enterRowLabel = new JLabel("Enter Row");
        panel.add(enterRowLabel);

        Dimension d = userRowEntry.getPreferredSize();
        userRowEntry.setMaximumSize(new Dimension(200, d.height));
        panel.add(userRowEntry);

        JLabel enterColLabel = new JLabel("Enter Column");
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
        JLabel loseMessage = new JLabel("You missed!");
        panel.add(loseMessage);
    }
}
