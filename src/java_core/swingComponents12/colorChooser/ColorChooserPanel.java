package java_core.swingComponents12.colorChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChooserPanel extends JPanel {
    public ColorChooserPanel() {
        JButton modalBotton = new JButton("modal");
        modalBotton.addActionListener(new ModalListener());
        add(modalBotton);

        JButton modelessButton = new JButton("Modeless");
        modalBotton.addActionListener(new ModelessListener());
        add(modelessButton);

        JButton immediateButton = new JButton("Immediate");
        immediateButton.addActionListener(new ImmediateListener());
        add(immediateButton);
    }

    private class ModalListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Color defaultColor = getBackground();
            Color selected = JColorChooser.showDialog(ColorChooserPanel.this,
                    "Set background", defaultColor);
            if(selected != null) setBackground(selected);
        }
    }

    private class ModelessListener implements ActionListener {
        private JDialog dialog;
        private JColorChooser chooser;

        public ModelessListener() {
            chooser = new JColorChooser();
            dialog = JColorChooser.createDialog(ColorChooserPanel.this,
                    "Background color", false, chooser,
                    e-> setBackground(chooser.getColor()), null);

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            chooser.setColor(getBackground());
            dialog.setVisible(true);
        }
    }

    private class ImmediateListener implements ActionListener {
        private  JDialog dialog;
        private JColorChooser chooser;

        public ImmediateListener() {
            chooser = new JColorChooser();
            chooser.getSelectionModel().addChangeListener(e->
                    setBackground(chooser.getColor()));
            dialog = new JDialog((Frame) null, false);
            dialog.add(chooser);
            dialog.pack();
        }


        @Override
        public void actionPerformed(ActionEvent e) {
            chooser.setColor(getBackground());
            dialog.setVisible(true);
        }
    }
}
