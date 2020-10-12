package java_core.swingComponents12.dialog;

import javax.swing.*;
import java.awt.*;

public class AboutDialog extends JDialog {
    public AboutDialog(JFrame owner) {
        super(owner, "About Dialog test", true);

        add(new JLabel("<html><h1><i> Core Java</i></h1><hr>Mari learn Horstmann books</html>"),
                BorderLayout.CENTER);

        JButton ok = new JButton("Ok");
        ok.addActionListener(e-> setVisible(false));

        JPanel panel = new JPanel();
        panel.add(ok);
        add(panel, BorderLayout.SOUTH);

        pack();
    }
}
