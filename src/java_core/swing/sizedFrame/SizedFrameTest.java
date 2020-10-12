package java_core.swing.sizedFrame;

import javax.swing.*;
import java.awt.*;

public class SizedFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame frame = new SizedFrame();
            frame.setTitle("Mari Sized Frame");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Image img = new ImageIcon("icon.gif").getImage();
            frame.setIconImage(img);
            frame.setVisible(true);
        });
    }
}
