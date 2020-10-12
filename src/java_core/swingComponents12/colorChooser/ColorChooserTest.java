package java_core.swingComponents12.colorChooser;

import javax.swing.*;
import java.awt.*;

public class ColorChooserTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame frame = new ColorChooserFrame();
            frame.setTitle("test color chooser");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
