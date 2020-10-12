package java_core.swingComponents12.circleLayout;

import javax.swing.*;
import java.awt.*;

public class CircleLayoutTest {
    public static void main(String[] args)
    {
        EventQueue.invokeLater(() -> {
            JFrame frame = new CircleLayoutFrame();
            frame.setTitle("CircleLayoutTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
