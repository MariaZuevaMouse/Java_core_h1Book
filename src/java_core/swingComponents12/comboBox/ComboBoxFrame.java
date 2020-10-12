package java_core.swingComponents12.comboBox;

import javax.swing.*;
import java.awt.*;

public class ComboBoxFrame extends JFrame {
    private  JComboBox<String> faceCombo;
    private JLabel label;
    protected static final int DEFAULT_SIZE = 24;

    public ComboBoxFrame() throws HeadlessException {
        setBounds(300,300,500,300);
        label = new JLabel("The quick brown fox jump over the lazy dog.");
        label.setFont(new Font("Serif", Font.PLAIN, DEFAULT_SIZE));
        add(label, BorderLayout.CENTER);

        faceCombo = new JComboBox<>();
        faceCombo.addItem("Serif");
        faceCombo.addItem("SansSerif");
        faceCombo.addItem("Monospaced");
        faceCombo.addItem("Dialog");
        faceCombo.addItem("DialogInput");

        faceCombo.addActionListener(event->{
            label.setFont(new Font(faceCombo.getItemAt(faceCombo.getSelectedIndex()),
                    Font.PLAIN, DEFAULT_SIZE));
        });
        JPanel comboPanel = new JPanel();
        comboPanel.add(faceCombo);
        add(comboPanel, BorderLayout.SOUTH);
    }
}
