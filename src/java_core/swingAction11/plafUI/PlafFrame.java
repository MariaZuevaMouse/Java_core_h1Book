package java_core.swingAction11.plafUI;

import javax.swing.*;
import java.awt.*;

public class PlafFrame extends JFrame {
    private  JPanel buttonPanel;
    private static final int DEFAULT_WIDTH = 500;
    private static final int DEFAULT_HEIGHT = 350;

    public PlafFrame() throws HeadlessException {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        buttonPanel = new JPanel();

        UIManager.LookAndFeelInfo[] infos =
                UIManager.getInstalledLookAndFeels();

        for (UIManager.LookAndFeelInfo info : infos)
            makeButton(info.getName(), info.getClassName());

        add(buttonPanel);
        pack();
    }
    private void makeButton(String name, String className){
        JButton button = new JButton(name);
        buttonPanel.add(button);

        button.addActionListener(event ->{
            try{
                UIManager.setLookAndFeel(className);
                SwingUtilities.updateComponentTreeUI(this);
                pack();
            }catch(Exception e){
                e.printStackTrace();
            }
        });
    }
}
