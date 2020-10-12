package java_core.swingComponents12.border;

import javax.swing.*;
import java.awt.*;

public class BorderTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame frame = new BorderFrame();
            frame.setTitle("Border test!");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
