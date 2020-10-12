package java_core.swing.font;

import javax.swing.*;
import java_core.swing.font.FontComponent;
import java.awt.geom.*;
import java.awt.*;

public class FontFrame extends JFrame {
    public FontFrame()  {
        add(new FontComponent());
        pack();
    }
}
