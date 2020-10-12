package java_core.swingComponents12.text;

import javax.swing.*;
import java.awt.*;

public class TextComponentTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame frame = new TextComponentFrame();
            frame.setTitle("Text component test!");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
