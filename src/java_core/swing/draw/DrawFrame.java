package java_core.swing.draw;

import javax.swing.*;

public class DrawFrame extends JFrame {
    public DrawFrame(){
        add(new DrawComponent());
        pack();
    }
}
