package java_core.threads14.swing;

import javax.swing.*;
import java.awt.*;

public class SwingThreadsTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame frame = new SwingThreadFrame();
            frame.setTitle("SwingThreadTest");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });

    }
}
