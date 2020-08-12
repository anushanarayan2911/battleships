import javax.swing.*;

public class View {

    public void GUI() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize(350, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        frame.setVisible(true);
    }
}
