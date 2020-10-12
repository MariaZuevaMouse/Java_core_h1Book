package java_core.swingAction11.plafUI;

import javax.swing.*;
import java.awt.*;

public class PlafTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame frame = new PlafFrame();
            frame.setTitle("UI test mari");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
