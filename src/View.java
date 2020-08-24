import jdk.internal.jimage.ImageStrings;

import javax.swing.*;
import java.awt.*;

public class View {

    private JFrame frame;
    private JPanel panel;

    public View() {
        frame = new JFrame();
        panel = new JPanel();

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

        JTextField userRowEntry = new JTextField(10);
        Dimension d = userRowEntry.getPreferredSize();
        userRowEntry.setMaximumSize(new Dimension(200, d.height));
        panel.add(userRowEntry);

        JLabel enterColLabel = new JLabel("Enter Column");
        panel.add(enterColLabel);

        JTextField userColEntry = new JTextField();
        Dimension dim = userColEntry.getPreferredSize();
        userColEntry.setMaximumSize(new Dimension(200, dim.height));
        panel.add(userColEntry);

        JButton OKButton = new JButton("OK");
        panel.add(OKButton);

    }
}
