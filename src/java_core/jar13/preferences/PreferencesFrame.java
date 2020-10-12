package java_core.jar13.preferences;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.InputEvent;
import java.io.*;
import java.util.prefs.Preferences;

public class PreferencesFrame extends JFrame {
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 300;
    private Preferences root = Preferences.userRoot();
    private Preferences node = root.node("com/horstman/corejava");

    public PreferencesFrame() throws HeadlessException {
        int left = node.getInt("left", 0);
        int top = node.getInt("top", 0);
        int width= node.getInt("width", DEFAULT_WIDTH);
        int height = node.getInt("height", DEFAULT_HEIGHT);
        setBounds(left, top, width, height);

        String title = node.get("title", "");
        if(title.equals(""))
            title = JOptionPane.showInputDialog("Please supply a frame title");

        if(title == null) title = "";
        setTitle(title);

        final JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));
        chooser.setFileFilter(new FileNameExtensionFilter("XML files", "xml"));

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu menu = new JMenu("File");
        menuBar.add(menu);


        JMenuItem exportItem = new JMenuItem("Export preferences");
        menu.add(exportItem);
        exportItem.addActionListener(e->{
            if(chooser.showSaveDialog(PreferencesFrame.this)
                    ==JFileChooser.APPROVE_OPTION){
                try{
                    savePreferences();
                    OutputStream out =
                            new FileOutputStream(chooser.getSelectedFile());
                    node.exportSubtree(out);
                    out.close();

                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });
        JMenuItem importItem = new JMenuItem("Import preferences");
        menu.add(importItem);
        importItem
                .addActionListener(e -> {
                    if(chooser.showOpenDialog(PreferencesFrame.this)
                    == JFileChooser.APPROVE_OPTION){
                        try{
                            InputStream in = new FileInputStream(chooser.getSelectedFile());
                            Preferences.importPreferences(in);
                            in.close();
                        }catch (Exception ex){
                            ex.printStackTrace();
                        }
                    }
                });



    }

    private void savePreferences() {
        node.putInt("left", getX());
        node.putInt("top", getY());
        node.putInt("width", getWidth());
        node.putInt("hight", getHeight());
        node.put("title", getTitle());
    }
}
