package java_core.swingAction11.button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFrame extends JFrame {
    private JPanel buttonPanel;
    private static final int DEFAULT_WIDTH = 500;
    private static final int DEFAULT_HEIGHT = 350;

    public ButtonFrame() throws HeadlessException {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        JButton yellowButton = new JButton("Yellow");
        JButton blueButton = new JButton("Blue");
        JButton redButton = new JButton("Red");

        buttonPanel = new JPanel();

        buttonPanel.add(yellowButton);
        buttonPanel.add(blueButton);
        buttonPanel.add(redButton);
        add(buttonPanel);

        ColorAction yellowAction = new ColorAction(Color.YELLOW);
        ColorAction blueAction = new ColorAction(Color.BLUE);
        ColorAction redAction = new ColorAction(Color.RED);

        yellowButton.addActionListener(yellowAction);
        blueButton.addActionListener(blueAction);
        redButton.addActionListener(redAction);
    }
    private class ColorAction implements ActionListener{
        private Color backgroundColor;

        public ColorAction(Color backgroundColor) {
            this.backgroundColor = backgroundColor;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            buttonPanel.setBackground(backgroundColor);
        }
    }
}
