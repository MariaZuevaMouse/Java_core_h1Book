package java_core.swingAction11.mouse;

import javax.swing.*;
import java.awt.*;

public class MouseTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame frame = new MouseFrame();
            frame.setTitle("MariMouseTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
