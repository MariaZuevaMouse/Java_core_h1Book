package java_core.threads14.swing;

import javax.swing.*;
import java.awt.*;

public class SwingThreadFrame extends JFrame {
    public SwingThreadFrame() throws HeadlessException {
        final JComboBox<Integer> combo = new JComboBox<>();
        combo.insertItemAt(Integer.MAX_VALUE, 0);
        combo.setPrototypeDisplayValue(combo.getItemAt(0));
        combo.setSelectedIndex(0);
        JPanel panel = new JPanel();

        JButton goodButton = new JButton("Good");
        goodButton.addActionListener(event ->
                new Thread(new GoodWorkerRunnable(combo)).start());
        panel.add(goodButton);
        JButton badButton = new JButton("Bad");
        badButton.addActionListener(event->
                new Thread(new BadWorkerRunnable(combo)).start());
        panel.add(badButton);

        panel.add(combo);
        add(panel);
        pack();
    }
}
