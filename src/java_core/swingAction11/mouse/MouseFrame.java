package java_core.swingAction11.mouse;

import javax.swing.*;
import java.awt.*;

public class MouseFrame extends JFrame {
    public MouseFrame() throws HeadlessException {
        add(new MouseComponent());
        pack();
    }
}
