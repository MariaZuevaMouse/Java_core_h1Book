package java_core.swing.image;

import javax.swing.*;
import java.awt.*;

public class ImageFrame extends JFrame {
    public ImageFrame() throws HeadlessException {
        add(new ImageComponent());
        pack();
    }
}
