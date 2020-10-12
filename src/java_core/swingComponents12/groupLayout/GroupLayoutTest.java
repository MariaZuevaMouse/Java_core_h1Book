package java_core.swingComponents12.groupLayout;

import javax.swing.*;
import java.awt.*;

public class GroupLayoutTest {
    public static void main(String[] args)
    {
        EventQueue.invokeLater(() -> {
            JFrame frame = new FontFrame();
            frame.setTitle("GroupLayoutTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
