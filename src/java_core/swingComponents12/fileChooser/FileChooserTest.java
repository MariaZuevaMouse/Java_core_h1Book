package java_core.swingComponents12.fileChooser;

import javax.swing.*;
import java.awt.*;

public class FileChooserTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame frame = new ImageViewerFrame();
            frame.setTitle("File chooser test");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
