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
        //frame.setLayout(new SpringLayout());
        //panel.setSize(300, 300);
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void displayBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            JLabel row = new JLabel(String.valueOf(board[i]));
            int y = 10 * i;
            row.setBounds(100, y, 5, 5);
            panel.add(row);
        }
    }
}
