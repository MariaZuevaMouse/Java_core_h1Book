package java_core.swing.draw;

import javax.swing.*;
import java.awt.*;

public class DrawTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame frame = new DrawFrame();
            frame.setTitle("mari DrawTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
