package java_core.swing.notHelloWorld;

import javax.swing.*;

public class NotHelloWorldFrame extends JFrame {
    public NotHelloWorldFrame(){
        add(new NotHelloWorldComponent());
        pack();
    }
}
