package java_core.swingComponents12.dialog;

//import com.sun.deploy.ui.AboutDialog;

import javax.swing.*;
import java.awt.*;

public class DialogFrame extends JFrame {

    private static  final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;
    private AboutDialog dialog;

    public DialogFrame() throws HeadlessException {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        JMenuItem aboutItem = new JMenuItem("About");

        aboutItem.addActionListener(e ->{
            if(dialog == null) {
                dialog = new java_core.swingComponents12.dialog.AboutDialog(DialogFrame.this);
                        //new AboutDialog(DialogFrame.this, true);
            }
            dialog.setVisible(true);
        });
        fileMenu.add(aboutItem);

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> System.exit(0));
        fileMenu.add(exitItem);


    }
}
