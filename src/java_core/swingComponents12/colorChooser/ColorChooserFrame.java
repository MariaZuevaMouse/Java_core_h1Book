package java_core.swingComponents12.colorChooser;

import javax.swing.*;
import java.awt.*;

public class ColorChooserFrame extends JFrame {

    public ColorChooserFrame()  {
        setBounds(300,300,300,300);
        ColorChooserPanel panel = new ColorChooserPanel();
        add(panel);
    }
}
