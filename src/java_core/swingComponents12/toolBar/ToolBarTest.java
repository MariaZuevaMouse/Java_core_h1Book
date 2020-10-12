package java_core.swingComponents12.toolBar;

import javax.swing.*;
import java.awt.*;

public class ToolBarTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame frame = new ToolBarFrame();
            frame.setTitle("menu test");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

        });
    }
}
